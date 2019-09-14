package com.tamimattafi.ihelp.app.presentation.mvp.fragment

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.holders.Actions
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerController
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeContract
import com.tamimattafi.ihelp.utils.AppUtils
import kotlinx.android.synthetic.main.fragment_recycler.*
import kotlinx.android.synthetic.main.fragment_recycler_refresher.*
import kotlinx.android.synthetic.main.toolbar_home.*
import javax.inject.Inject

abstract class MvpRecyclerFragment<
        HOLDER : MvpRecyclerContract.Holder,
        PRESENTER : MvpRecyclerFragmentContract.Presenter<HOLDER>,
        ADAPTER : MvpRecyclerFragmentContract.Adapter<HOLDER>
        > : NavigationContract.NavigationFragment(), MvpRecyclerFragmentContract.View<HOLDER> {

    override val layoutId: Int = R.layout.fragment_home

    @Inject
    lateinit var presenter : PRESENTER

    @Inject
    lateinit var adapter : ADAPTER

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.controller = MvpRecyclerController(recycler)
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

    override fun onHolderAction(listPosition: Int, adapterPosition: Int, action: Int, itemId: Int?) {
        Actions.apply {
            when (action) {
                ACTION_REFRESH -> adapter.refresh()
                ACTION_TRY_AGAIN -> adapter.tryAgain()
            }
        }
    }

    override fun getAdapter(): MvpRecyclerContract.RecyclerAdapter<HOLDER> = adapter

    override fun setRefreshing(refreshing: Boolean) {
        refresher.isRefreshing = refreshing
        recycler.visibility = if (refreshing) View.INVISIBLE else View.VISIBLE
    }



}