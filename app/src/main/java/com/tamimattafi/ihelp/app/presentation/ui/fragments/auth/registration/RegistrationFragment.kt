package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration


import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginContract
import javax.inject.Inject

class RegistrationFragment : NavigationContract.NavigationFragment() , RegistrationContract.View {

    override var fragmentName: String = "fragment-registration"
    override val layoutId: Int = R.layout.fragment_registration

    @Inject
    lateinit var presenter: RegistrationContract.Presenter

}