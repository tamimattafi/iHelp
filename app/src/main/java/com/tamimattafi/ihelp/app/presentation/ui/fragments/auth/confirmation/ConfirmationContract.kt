package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.confirmation

interface ConfirmationContract {
    interface Presenter {
        fun onOkBtnPressed()
    }

    interface View {
        fun getNewPassword(): String

        fun getRepeatNewPassword(): String

        fun isPasswordsValid(): Boolean

        fun setLoading()

        fun showError(message: String)
    }
}