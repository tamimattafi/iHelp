package com.tamimattafi.ihelp.interractor

import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.RegistrationCredentails
import com.tamimattafi.ihelp.model.auth.Token
import retrofit2.Call
import retrofit2.http.POST

interface AuthService {

    @POST("users/login")
    fun login(loginCredentials: LoginCredentials) : Call<Token>


    @POST("users/register")
    fun register(registrationCredentials: RegistrationCredentails) : Call<Token>

}