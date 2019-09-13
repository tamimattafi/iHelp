package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login

interface LoginContract {

    interface Presenter {
        fun onLoginBtnPressed()

        fun onForgotPasswordBtnPressed()
    }

    interface View {
        fun getLogin(): String

        fun getPassword(): String
    }
}