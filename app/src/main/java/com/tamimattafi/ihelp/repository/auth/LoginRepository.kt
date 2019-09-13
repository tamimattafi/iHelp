package com.tamimattafi.ihelp.repository.auth

import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.Token
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import retrofit2.Call
import javax.inject.Inject


class LoginRepository @Inject constructor(): AuthContract.BaseAuthRepository<LoginCredentials>() {

    override fun getAuthCall(credentials: LoginCredentials): Call<Token>
            = interractor.login(credentials)

}