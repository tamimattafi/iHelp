package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class VolunteerProfileFragment : NavigationContract.NavigationFragment() ,
    VolunteerProfileContract.View {

    override var fragmentName: String = "fragment-profile-volunteer"
    override val layoutId: Int = R.layout.fragment_profile_volunteer

    @Inject
    lateinit var presenter : VolunteerProfileContract.Presenter


}