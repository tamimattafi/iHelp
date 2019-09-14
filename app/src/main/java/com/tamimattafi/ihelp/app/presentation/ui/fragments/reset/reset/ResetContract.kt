package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset

interface ResetContract {
    interface Presenter {
        fun onVerifyBtnPressed()
    }

    interface View {
        fun getEmail(): String
        fun isEmailValid(): Boolean
        fun onEmailSent()
        fun showError(message : String)
        fun showLoading()
    }
}