package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import kotlinx.android.synthetic.main.toolbar_home.*

abstract class BaseHomeFragment : NavigationContract.NavigationFragment(), BaseHomeContract.View {

    override val layoutId: Int = R.layout.fragment_home

    abstract fun getTitle() : String
    abstract fun getSearchFragment() : NavigationContract.NavigationFragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        search.setOnClickListener {
            navigationManager.requestSlideRightScreen(getSearchFragment())
        }
    }




}