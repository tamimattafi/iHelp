package com.tamimattafi.ihelp.model.auth.global

import com.tamimattafi.ihelp.model.auth.LoginCredentials

interface BaseCredentials : EmailCredentials {
    val password : String


    fun toLoginCredentials() : LoginCredentials
        = LoginCredentials(email, password)
}
