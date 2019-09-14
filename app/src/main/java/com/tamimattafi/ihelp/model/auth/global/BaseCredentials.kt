package com.tamimattafi.ihelp.model.auth.global

import com.tamimattafi.ihelp.model.auth.LoginCredentials

interface BaseCredentials : UsernameCredentials {
    val password : String


    fun toLoginCredentials() : LoginCredentials
        = LoginCredentials(username, password)
}
