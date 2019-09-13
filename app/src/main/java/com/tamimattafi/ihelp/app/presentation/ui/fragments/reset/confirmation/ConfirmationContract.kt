package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation

interface ConfirmationContract {
    interface Presenter {
        fun onConfirmBtnClick()
    }

    interface View {
        fun isFormValid() : Boolean
        fun getFirstPassword() : String
        fun getSecondPassword() : String
        fun onConfirmSuccess()
        fun showError(message : String)
    }
}