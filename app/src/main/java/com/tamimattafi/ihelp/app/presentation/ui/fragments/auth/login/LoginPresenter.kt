package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login

import com.tamimattafi.ihelp.app.di.scopes.LoginScope
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

@LoginScope
class LoginPresenter @Inject constructor(view: LoginContract.View) : BasePresenter<LoginContract.View>(view), LoginContract.Presenter {

    override fun onLoginBtnPressed() {
    }

    override fun onForgotPasswordBtnPressed() {

    }
}
