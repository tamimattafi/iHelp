package com.tamimattafi.ihelp.model.auth

import com.tamimattafi.ihelp.model.auth.global.BaseCredentials
import com.tamimattafi.ihelp.model.auth.global.DoublePasswordCredentials


data class RegistrationCredentials(
    var username : String,
    override var email: String,
    override val password: String,
    var type : Boolean
    ) : BaseCredentials, DoublePasswordCredentials {

    override val password1 : String
    get() = password

    override val password2 : String
    get() = password

    companion object {
        const val VOLUNTEER = false
        const val ORGANIZATION = true
    }

}