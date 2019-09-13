package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login


import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.utils.FormUtils
import kotlinx.android.synthetic.main.fragment_login.*
import javax.inject.Inject

class LoginFragment : NavigationContract.NavigationFragment() , LoginContract.View {

    override var fragmentName: String = "fragment-authenticate"
    override val layoutId: Int = R.layout.fragment_login

    @Inject
    lateinit var presenter: LoginContract.Presenter

    override fun getLogin() = email.text.toString()

    override fun getPassword() = password.text.toString()

    override fun isFormValid(): Boolean = FormUtils.isFormCorrect(email, emailLayout, password, passwordLayout)

    override fun onLoginSuccess() {

    }

    override fun showError(message: String) {

    }

}