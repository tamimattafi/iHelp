package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import javax.inject.Inject

class LoginPresenter @Inject constructor(view: LoginContract.View) : BasePresenter<LoginContract.View>(view), LoginContract.Presenter {

    @Inject
    lateinit var repository: AuthContract.BaseAuthRepository<LoginCredentials>

    override fun onLoginBtnPressed() {
        with(view) {
            if (isFormValid()) {
                setLoading()
                repository.authenticate(
                    LoginCredentials(
                        getLogin(),
                        getPassword()
                    )
                ).setOnSuccessListener { onLoginSuccess() }.setOnFailureListener { showError(it) }
            }
        }
    }

    override fun onForgotPasswordBtnPressed() {

    }
}
