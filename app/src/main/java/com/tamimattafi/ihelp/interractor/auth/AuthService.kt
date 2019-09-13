package com.tamimattafi.ihelp.interractor.auth

import com.tamimattafi.ihelp.interractor.ApiPaths
import com.tamimattafi.ihelp.model.auth.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST(ApiPaths.LOGIN)
    fun login(@Body loginCredentials: LoginCredentials) : Call<Token>


    @POST(ApiPaths.REGISTRATION)
    fun register(@Body registrationCredentials: RegistrationCredentials) : Call<Token>

}