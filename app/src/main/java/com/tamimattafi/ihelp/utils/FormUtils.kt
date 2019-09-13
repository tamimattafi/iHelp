package com.tamimattafi.ihelp.utils

import com.tamimattafi.ihelp.app.presentation.custom.views.FormEditText
import com.tamimattafi.ihelp.app.presentation.custom.views.FormInputLayout
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.utils.InputUtils.isPasswordsEqual


object FormUtils {

    fun isFormCorrect(
        username: FormEditText, usernameLayout: FormInputLayout,
        email: FormEditText, emailLayout: FormInputLayout,
        password: FormEditText, passwordLayout: FormInputLayout,
        confirmPassword: FormEditText, confirmPasswordLayout: FormInputLayout
    ): Boolean {
        return when {
            !InputUtils.isLengthEnough(username, usernameLayout, 6) || !InputUtils.isEditTextNoSpecialCharacters(username, usernameLayout) -> {
                false
            }
            !isFormCorrect(email.apply { requestFocus() }, emailLayout, password, passwordLayout) -> {
                hideError(usernameLayout)
                false
            }
            !isPasswordsEqual(password, confirmPassword, confirmPasswordLayout) -> {
                hideError(confirmPasswordLayout)
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

    private fun hideError(inputLayout: FormInputLayout) {
        inputLayout.apply {
            requestFocus()
            isErrorEnabled = false
            error = null
        }
    }

}