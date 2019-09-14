package com.tamimattafi.ihelp.interractor.auth

import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import dagger.Reusable
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

@Reusable
class AuthInterceptor @Inject constructor(val preferences: AuthContract.Preferences) : Interceptor {

    @Inject
    lateinit var interractor : AuthService

    override fun intercept(chain: Interceptor.Chain): Response {
        with(preferences) {
            val initialRequest = chain.request()
            var modifiedRequest: Request

            return if (isLoggedIn() && getToken() != null) {
                modifiedRequest = initialRequest.newBuilder()
                    .addHeader("Authorization", "Token " + getToken()!!.key)
                    .build()

                val response = chain.proceed(modifiedRequest)

                if (response.code() == 401) {
                    if (refreshToken()) {
                        modifiedRequest = initialRequest.newBuilder()
                            .addHeader("Authorization", "Token " + getToken()!!.key)
                            .build()
                        return chain.proceed(modifiedRequest)
                    }
                }

                response
            } else chain.proceed(initialRequest)
        }
    }

    private fun refreshToken(): Boolean {
        return synchronized(this) {
            with(interractor.login(preferences.getLoginCredentials() ?: return false).execute()) {
                if (isSuccessful) {
                    preferences.setToken(body())
                    true
                } else false
            }
        }
    }
}