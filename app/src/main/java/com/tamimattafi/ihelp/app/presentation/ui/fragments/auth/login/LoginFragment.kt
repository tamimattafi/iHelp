package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login


import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class LoginFragment : NavigationContract.NavigationFragment() , LoginContract.View {

    override var fragmentName: String = "fragment-authenticate"
    override val layoutId: Int = R.layout.fragment_login

    @Inject
    lateinit var presenter: LoginContract.Presenter

}