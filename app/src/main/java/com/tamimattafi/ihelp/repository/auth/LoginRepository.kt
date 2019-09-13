package com.tamimattafi.ihelp.repository.auth

import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.Token
import retrofit2.Call

class LoginRepository : AuthContract.BaseAuthRepository<LoginCredentials>() {

    override fun getTokenCall(credentials: LoginCredentials): Call<Token>
            = interractor.login(credentials)

}