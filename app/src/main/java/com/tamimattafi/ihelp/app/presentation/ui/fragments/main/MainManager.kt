package com.tamimattafi.ihelp.app.presentation.ui.fragments.main

import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu.MenuFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfileFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer.VolunteerProfileFragment
import javax.inject.Inject

class MainManager @Inject constructor(val preferences: MainContract.Preferences)  : MainContract.Manager{

    private var list : ArrayList<NavigationContract.NavigationFragment>? = null

    override fun getFragments() : ArrayList<NavigationContract.NavigationFragment>
        = list ?: setUpFragments().also {
                it.add(MenuFragment())
                this.list = it
            }

    override fun getSize(): Int = (list ?: setUpFragments()).size

    private fun setUpFragments(): ArrayList<NavigationContract.NavigationFragment> {
        return if (preferences.isVolunteer()) setUpVolunteerFragments()
        else setUpOrganizationFragments()
    }

    private fun setUpOrganizationFragments(): ArrayList<NavigationContract.NavigationFragment> {
        return ArrayList<NavigationContract.NavigationFragment>().apply {
            add(OrganizationHomeFragment())
            add(OrganizationProfileFragment())
        }
    }

    private fun setUpVolunteerFragments(): ArrayList<NavigationContract.NavigationFragment> {
        return ArrayList<NavigationContract.NavigationFragment>().apply {
            add(VolunteerHomeFragment())
            add(VolunteerProfileFragment())
        }
    }

}