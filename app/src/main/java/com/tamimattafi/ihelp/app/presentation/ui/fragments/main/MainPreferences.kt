package com.tamimattafi.ihelp.app.presentation.ui.fragments.main

import android.content.SharedPreferences
import javax.inject.Inject

class MainPreferences @Inject constructor(val preferences: SharedPreferences) : MainContract.Preferences {

    override fun setVolunteer(isVolunteer : Boolean) = with(preferences.edit()) {
        putBoolean(IS_VOLUNTEER, isVolunteer)
        apply()
    }

    override fun isVolunteer() : Boolean = preferences.getBoolean(IS_VOLUNTEER, false)

    companion object {
        const val IS_VOLUNTEER = "volunteer"
    }
}