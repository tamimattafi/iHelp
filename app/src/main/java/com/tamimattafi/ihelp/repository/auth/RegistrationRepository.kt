package com.tamimattafi.ihelp.repository.auth

import com.tamimattafi.ihelp.model.auth.RegistrationCredentails
import com.tamimattafi.ihelp.model.auth.Token
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import retrofit2.Call
import javax.inject.Inject

class RegistrationRepository @Inject constructor() : AuthContract.BaseAuthRepository<RegistrationCredentails> () {

    override fun getTokenCall(credentials: RegistrationCredentails): Call<Token>
            = interractor.register(credentials)

}