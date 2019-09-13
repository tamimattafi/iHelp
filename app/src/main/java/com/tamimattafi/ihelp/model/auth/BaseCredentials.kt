package com.tamimattafi.ihelp.model.auth

interface BaseCredentials {
    var email : String
    var password : String


    fun toLoginCredntials() : LoginCredentials
        = LoginCredentials(email, password)
}
