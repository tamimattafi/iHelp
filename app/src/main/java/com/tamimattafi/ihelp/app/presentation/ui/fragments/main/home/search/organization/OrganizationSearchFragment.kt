package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeContract
import javax.inject.Inject

class OrganizationSearchFragment : NavigationContract.NavigationFragment() ,
    OrganizationSearchContract.View {

    override var fragmentName: String = "fragment-home-organization"
    override val layoutId: Int = R.layout.fragment_home_organization

    @Inject
    lateinit var presenter : OrganizationSearchContract.Presenter


}