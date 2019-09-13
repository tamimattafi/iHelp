package com.tamimattafi.ihelp.utils

import com.tamimattafi.ihelp.app.presentation.custom.views.FormEditText
import com.tamimattafi.ihelp.app.presentation.custom.views.FormInputLayout
import com.tamimattafi.ihelp.model.auth.LoginCredentials


object FormUtils {

    fun isFormCorrect(
        username: FormEditText, usernameLayout: FormInputLayout,
        email: FormEditText, emailLayout: FormInputLayout,
        password: FormEditText, passwordLayout: FormInputLayout
    ): Boolean {
        return when {
            !InputUtils.isLengthEnough(username, usernameLayout, 6) || !InputUtils.isEditTextNoSpecialCharacters(username, usernameLayout) -> {
                false
            }
            !isFormCorrect(email.apply { requestFocus() }, emailLayout, password, passwordLayout) -> {
                hideError(usernameLayout)
                false
            }
            else -> {
                hideError(usernameLayout)
                true
            }
        }
    }

    fun isFormCorrect(
        email: FormEditText, emailLayout: FormInputLayout,
        password: FormEditText, passwordLayout: FormInputLayout
    ): Boolean {
        return when {
            InputUtils.isEditTextEmpty(email, emailLayout) || !InputUtils.isEditTextAnEmail(email, emailLayout) -> {
                false
            }
            !InputUtils.isLengthEnough(password, passwordLayout, 8) || !InputUtils.isEditTextValidPassword(password, passwordLayout) -> {
                hideError(emailLayout)
                false
            }
            else -> {
                hideError(emailLayout)
                hideError(passwordLayout)
                true
            }

        }
    }

    fun hideError(inputLayout: FormInputLayout) {
        inputLayout.apply {
            requestFocus()
            isErrorEnabled = false
            error = null
        }
    }

}