package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeContract
import javax.inject.Inject

class OrganizationProfileFragment : NavigationContract.NavigationFragment() ,
    OrganizationProfileContract.View {

    override var fragmentName: String = "fragment-profile-organization"
    override val layoutId: Int = R.layout.fragment_profile_organization

    @Inject
    lateinit var presenter : OrganizationProfileContract.Presenter


}