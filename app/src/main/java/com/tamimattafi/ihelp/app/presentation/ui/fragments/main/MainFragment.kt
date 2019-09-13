package com.tamimattafi.ihelp.app.presentation.ui.fragments.main

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class MainFragment : NavigationContract.NavigationFragment() {
    override var fragmentName: String = "fragment-main"
    override val layoutId: Int = R.layout.fragment_main


    @Inject
    lateinit var pagerAdapter: MainPagerAdapter



}