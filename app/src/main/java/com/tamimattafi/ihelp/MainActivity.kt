package com.tamimattafi.ihelp

import android.os.Bundle
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationActivity
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeFragment
import javax.inject.Inject

class MainActivity : NavigationActivity() {

    override val layoutId: Int = R.layout.activity_main
    override var rootId: Int = R.id.root

    @Inject
    lateinit var launcher: Launcher

    override fun onViewCreated(savedInstanceState: Bundle?) {
        requestAttachBaseScreen(VolunteerHomeFragment())
    }

    override fun beforeViewCreated() {
        theme.applyStyle(R.style.AppTheme, true)
    }

}
