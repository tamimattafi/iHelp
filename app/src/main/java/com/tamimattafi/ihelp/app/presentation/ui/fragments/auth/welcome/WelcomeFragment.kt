package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome


import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class WelcomeFragment : NavigationContract.NavigationFragment() , WelcomeContract.View {

    override var fragmentName: String = "fragment-welcome"
    override val layoutId: Int = R.layout.fragment_welcome

    @Inject
    lateinit var presenter: WelcomeContract.Presenter

}