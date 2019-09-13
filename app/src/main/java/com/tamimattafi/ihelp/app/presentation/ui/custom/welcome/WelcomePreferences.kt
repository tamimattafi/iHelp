package com.tamimattafi.ihelp.app.presentation.ui.custom.welcome

import android.content.SharedPreferences
import javax.inject.Inject

class WelcomePreferences @Inject constructor(val preferences: SharedPreferences) {

    fun setShowWelcome(show : Boolean) {
        with(preferences.edit()) {
            putBoolean("showWelcome", show)
            apply()
        }
    }

    fun getShowWelcome() : Boolean  {
        return preferences.getBoolean("showWelcome", true)
    }
}