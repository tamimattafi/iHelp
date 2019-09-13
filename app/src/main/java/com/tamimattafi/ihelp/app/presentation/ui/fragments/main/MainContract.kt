package com.tamimattafi.ihelp.app.presentation.ui.fragments.main

import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract

interface MainContract {

    interface Preferences {
        fun isVolunteer() : Boolean
        fun setVolunteer(isVolunteer : Boolean)
    }

    interface Manager {
        fun getFragments() : List<NavigationContract.NavigationFragment>
        fun getSize() : Int
    }
}