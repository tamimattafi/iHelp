package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class OrganizationHomeFragment : NavigationContract.NavigationFragment() , OrganizationHomeContract.View {

    override var fragmentName: String = "fragment-home-organization"
    override val layoutId: Int = R.layout.fragment_home_organization

    @Inject
    lateinit var presenter : OrganizationHomeContract.Presenter


}