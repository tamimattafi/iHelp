package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration

interface RegistrationContract {

    interface Presenter {
        fun onRegisterBtnPressed()
    }

    interface View {
        fun isFormValid() : Boolean
        fun getUsername(): String
        fun getEmail(): String
        fun getPassword(): String
        fun onRegisterSuccess()
        fun showError(message : String)
        fun setLoading()
    }
}