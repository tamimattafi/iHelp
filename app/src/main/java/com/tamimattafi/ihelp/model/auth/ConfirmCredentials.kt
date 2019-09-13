package com.tamimattafi.ihelp.model.auth

import com.google.gson.annotations.SerializedName
import com.tamimattafi.ihelp.model.auth.global.DoublePasswordCredentials


data class ConfirmCredentials(
    @SerializedName("new_password1")
    override val password1 : String,
    @SerializedName("new_password2")
    override val password2 : String
) : DoublePasswordCredentials {

    lateinit var token : String

    companion object {
        const val VOLUNTEER = false
        const val ORGANIZATION = true
    }

}