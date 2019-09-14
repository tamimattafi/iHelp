package com.tamimattafi.ihelp

import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainFragment
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import javax.inject.Inject

class Launcher @Inject constructor(val preferences: AuthContract.Preferences) {

    fun getBaseFragment() : NavigationContract.NavigationFragment
        = if (preferences.isLoggedIn()) MainFragment() else LoginFragment()

}