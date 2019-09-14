package com.tamimattafi.ihelp.model.auth

import com.google.gson.annotations.SerializedName
import com.tamimattafi.ihelp.model.auth.global.BaseCredentials
import com.tamimattafi.ihelp.model.auth.global.DoublePasswordCredentials


data class RegistrationCredentials(
    override var username: String,
    var email : String,
    override val password: String,
    @SerializedName("user_type")
    var type : Boolean
    ) : BaseCredentials, DoublePasswordCredentials {

    override val password1 : String = password

    override val password2 : String = password

    companion object {
        const val VOLUNTEER = false
        const val ORGANIZATION = true
    }

}