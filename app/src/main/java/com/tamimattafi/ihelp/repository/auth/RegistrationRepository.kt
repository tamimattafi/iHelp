package com.tamimattafi.ihelp.repository.auth

import com.tamimattafi.ihelp.model.auth.RegistrationCredentials
import com.tamimattafi.ihelp.model.auth.Token
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import retrofit2.Call
import javax.inject.Inject

class RegistrationRepository @Inject constructor() : AuthContract.BaseAuthRepository<RegistrationCredentials> () {

    override fun getAuthCall(credentials: RegistrationCredentials): Call<Token>
            = interractor.register(credentials)

    override fun saveRegistrationRepository(credentials: RegistrationCredentials) {
        mainPreferences.setVolunteer(!credentials.type)
    }

}