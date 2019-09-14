package com.tamimattafi.ihelp.utils

import com.tamimattafi.ihelp.app.presentation.custom.views.FormEditText
import com.tamimattafi.ihelp.app.presentation.custom.views.FormInputLayout


object FormUtils {

    fun isFormCorrect(
        username: FormEditText, usernameLayout: FormInputLayout,
        email: FormEditText, emailLayout: FormInputLayout,
        password: FormEditText, passwordLayout: FormInputLayout,
        type : FormEditText, typeLayout : FormInputLayout): Boolean {
        return when {
            !InputUtils.isLengthEnough(username, usernameLayout, 3) || !InputUtils.isEditTextNoSpecialCharacters(username, usernameLayout) -> {
                false
            }
            !isEmailFormCorrect(email, emailLayout, password, passwordLayout) || InputUtils.isEditTextEmpty(type, typeLayout) -> {
                hideError(usernameLayout)
                false
            }
            else -> {
                hideError(usernameLayout)
                true
            }
        }
    }

    fun isUsernameFormCorrect(
        username : FormEditText, usernameLayout: FormInputLayout,
        password: FormEditText, passwordLayout: FormInputLayout
    ) : Boolean {
        return when {
            !InputUtils.isLengthEnough(username, usernameLayout, 3) || !InputUtils.isEditTextNoSpecialCharacters(username, usernameLayout) -> {
                false
            }
            !InputUtils.isLengthEnough(password, passwordLayout, 8) || !InputUtils.isEditTextValidPassword(password, passwordLayout) -> {
                hideError(usernameLayout)
                false
            }
            else -> {
                hideError(usernameLayout)
                hideError(passwordLayout)
                true
            }
        }
    }

    fun isEmailFormCorrect(
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
            error = null
            isErrorEnabled = false
        }
    }

}