package com.tamimattafi.ihelp.utils

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.views.FormEditText
import com.tamimattafi.ihelp.app.presentation.custom.views.FormInputLayout
import java.util.regex.Pattern

object InputUtils {

    fun isEditTextEmpty(editText: FormEditText, inputLayout: FormInputLayout): Boolean
        = if (editText.text?.isEmpty() == true) {
            inputLayout.error = editText.context.resources.getString(R.string.this_feild_is_required)
            editText.requestFocus()
            true
        } else {
            inputLayout.error = null
            inputLayout.isErrorEnabled = false
            false
        }



    fun isLengthEnough(editText: FormEditText, inputLayout: FormInputLayout, length : Int) : Boolean
        = if (editText.text.toString().length < length) {
            inputLayout.apply {
                with(context.resources) {
                    error = "${getString(R.string.length_must_be_at_least)} $length ${getString(R.string.characters_long)}"
                }
            }
            editText.requestFocus()
            false
        } else {
            inputLayout.error = null
            inputLayout.isErrorEnabled = false
            true
        }


    fun isEditTextAnEmail(editText: FormEditText, inputLayout: FormInputLayout): Boolean
        = if (android.util.Patterns.EMAIL_ADDRESS.matcher(editText.text.toString()).matches()) {
            inputLayout.error = null
            inputLayout.isErrorEnabled = false
            true
        } else {
            editText.requestFocus()
            inputLayout.error = editText.context.resources.getString(R.string.email_malformed)
            false
        }


    fun isEditTextNoSpecialCharacters(editText: FormEditText, inputLayout: FormInputLayout) : Boolean {
        return Pattern.compile("[a-zA-Z0-9]*").matcher(editText.text.toString()).matches().also {
            if (!it) {
                editText.requestFocus()
                inputLayout.error = editText.context.resources.getString(R.string.username_invalid)
            }
        }
    }

    fun isEditTextValidPassword(editText : FormEditText, inputLayout: FormInputLayout) : Boolean {
        return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{4,}$").matcher(editText.text.toString()).matches().also {
            if (!it) {
                editText.requestFocus()
                inputLayout.error = inputLayout.context.resources.getString(R.string.password_is_weak)
            }
        }
    }

    fun isPasswordsEqual(password: FormEditText, confirmPassword: FormEditText, confirmPasswordLayout: FormInputLayout): Boolean {
        return if (password.text.toString() == confirmPassword.text.toString()) {
            with(confirmPasswordLayout) {
                error = null
                isErrorEnabled = false
            }
            true
        } else {
            confirmPassword.error = confirmPasswordLayout.context.resources.getString(R.string.passwords_should_match)
            false
        }

    }

}