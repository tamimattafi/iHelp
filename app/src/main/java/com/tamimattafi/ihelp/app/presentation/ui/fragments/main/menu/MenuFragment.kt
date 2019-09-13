package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfileContract
import javax.inject.Inject

class MenuFragment : NavigationContract.NavigationFragment() ,
    MenuContract.View {

    override var fragmentName: String = "fragment-menu"
    override val layoutId: Int = R.layout.fragment_menu

    @Inject
    lateinit var presenter : MenuContract.Presenter


}