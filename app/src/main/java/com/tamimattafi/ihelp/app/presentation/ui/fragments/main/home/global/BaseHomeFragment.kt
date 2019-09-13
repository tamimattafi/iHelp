package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerController
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.utils.AppUtils
import kotlinx.android.synthetic.main.fragment_recycler.*
import kotlinx.android.synthetic.main.toolbar_home.*
import javax.inject.Inject

abstract class BaseHomeFragment<
        HOLDER : MvpRecyclerContract.Holder,
        PRESENTER : BaseHomeContract.Presenter<HOLDER>,
        ADAPTER : BaseHomeContract.Adapter<HOLDER>
        > : NavigationContract.NavigationFragment(), BaseHomeContract.View {

    override val layoutId: Int = R.layout.fragment_home

    @Inject
    lateinit var presenter : PRESENTER

    @Inject
    lateinit var adapter : ADAPTER

    abstract fun getTitle() : String
    abstract fun getSearchFragment() : NavigationContract.NavigationFragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.controller = MvpRecyclerController(recycler)
        search.setOnClickListener {
            navigationManager.requestSlideRightScreen(getSearchFragment())
        }
    }


    override fun onDestroyView() {
        presenter.onDestroyView()
        super.onDestroyView()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showError(message: String) {
        AppUtils.showToast(appContext, message)
    }




}