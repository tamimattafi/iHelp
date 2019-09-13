package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset

interface ResetContract {
    interface Presenter {
        fun onSendBtnPressed()
        fun onVerifyBtnPressed()
    }

    interface View {
        fun getEmail(): String
        fun getCode(): String
        fun isEmailValid(): Boolean
        fun setCodeAwaitingMode()
    }
}