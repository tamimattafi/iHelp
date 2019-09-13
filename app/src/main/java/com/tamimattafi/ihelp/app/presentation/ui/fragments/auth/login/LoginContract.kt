package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login

interface LoginContract {

    interface Presenter {
        fun onLoginBtnPressed()
        fun onForgotPasswordBtnPressed()
    }

    interface View {
        fun isFormValid() : Boolean
        fun getLogin(): String
        fun getPassword(): String
        fun onLoginSuccess()
        fun showError(message : String)
        fun setLoading()
    }
}