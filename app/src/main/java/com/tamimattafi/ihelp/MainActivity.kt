package com.tamimattafi.ihelp

import android.os.Bundle
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationActivity
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainManager
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu.MenuFragment

class MainActivity : NavigationActivity() {

    override val layoutId: Int = R.layout.activity_main
    override var rootId: Int = R.id.root

    override fun onViewCreated(savedInstanceState: Bundle?) {
        requestAttachBaseScreen(MenuFragment())
    }

    override fun beforeViewCreated() {
        theme.applyStyle(R.style.AppTheme, true)
    }

}
