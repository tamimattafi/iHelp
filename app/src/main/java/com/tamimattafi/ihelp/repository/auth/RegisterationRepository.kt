package com.tamimattafi.ihelp.repository.auth

import com.tamimattafi.ihelp.model.auth.RegistrationCredentails
import com.tamimattafi.ihelp.model.auth.Token
import retrofit2.Call

class RegisterationRepository : AuthContract.BaseAuthRepository<RegistrationCredentails>() {

    override fun getTokenCall(credentials: RegistrationCredentails): Call<Token>
            = interractor.register(credentials)

}