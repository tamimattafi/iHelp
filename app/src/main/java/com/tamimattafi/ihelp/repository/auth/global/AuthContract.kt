package com.tamimattafi.ihelp.repository.auth.global

import com.tamimattafi.ihelp.interractor.auth.AuthService
import com.tamimattafi.ihelp.model.auth.global.BaseCredentials
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.Token
import com.tamimattafi.ihelp.repository.global.SimplePreferencesRepository
import javax.inject.Inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

interface AuthContract {

    abstract class Base<T : BaseCredentials> : SimplePreferencesRepository<T>() {
        abstract fun authenticate(credentials : T) : SimplePreferencesRepository<T>
    }

    interface Preferences {
        fun isLoggedIn() : Boolean
        fun setLoggedIn(loggedIn : Boolean)
        fun setLoginCredentials(credentials: LoginCredentials?)
        fun getLoginCredentials() : LoginCredentials?
        fun setToken(token: Token?)
        fun getToken() : Token?
    }

    abstract class BaseAuthRepository<T : BaseCredentials> : Base<T>() {

        @Inject
        protected lateinit var interractor : AuthService

        protected abstract fun getAuthCall(credentials : T) : Call<Token>

        override fun authenticate(credentials: T) : BaseAuthRepository<T> {
            getAuthCall(credentials).enqueue(object : Callback<Token> {

                override fun onFailure(call: Call<Token>, t: Throwable) {
                    onFailure?.invoke(t.localizedMessage ?: t.message ?: t.toString())
                }

                override fun onResponse(call: Call<Token>, response: Response<Token>) {
                    response.body()?.let {
                        with(preferences) {
                            setLoggedIn(true)
                            setLoginCredentials(credentials.toLoginCredentials())
                            setToken(it)
                        }
                        onSuccess?.invoke()
                    } ?: onFailure?.invoke(response.errorBody()?.string() ?: "Token is null")
                }

            })

            return this
        }
    }

}