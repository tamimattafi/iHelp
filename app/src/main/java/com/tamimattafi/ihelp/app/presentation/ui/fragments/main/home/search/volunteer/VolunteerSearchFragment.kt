package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeContract
import javax.inject.Inject

class VolunteerSearchFragment : NavigationContract.NavigationFragment() ,
    VolunteerHomeContract.View {

    override var fragmentName: String = "fragment-search-volunteer"
    override val layoutId: Int = R.layout.fragment_home_volunteer

    @Inject
    lateinit var presenter : VolunteerHomeContract.Presenter


}