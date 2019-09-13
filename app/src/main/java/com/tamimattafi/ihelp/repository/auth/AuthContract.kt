package com.tamimattafi.ihelp.repository.auth

import com.tamimattafi.ihelp.interractor.AuthService
import com.tamimattafi.ihelp.model.auth.BaseCredentials
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.Token
import javax.inject.Inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

interface AuthContract {

    interface Base<T : BaseCredentials> {

        var onSuccess : (() -> Unit)?
        var onFailure : ((message : String) -> Unit)?

        fun authenticate(credentials : T)

    }

    interface Preferences {
        fun isLoggedIn() : Boolean
        fun setLoggedIn(loggedIn : Boolean)
        fun setLoginCredentials(credentials: LoginCredentials)
        fun getLoginCredentials() : LoginCredentials?
        fun setToken(token: Token)
        fun getToken() : Token?
    }


    abstract class BaseAuthRepository<T : BaseCredentials> : Base<T> {

        override var onSuccess: (() -> Unit)? = null
        override var onFailure: ((message: String) -> Unit)? = null

        @Inject
        lateinit var interractor : AuthService

        @Inject
        lateinit var preferences: Preferences

        abstract fun getTokenCall(credentials : T) : Call<Token>

        override fun authenticate(credentials: T) {
            getTokenCall(credentials).enqueue(object : Callback<Token> {
                override fun onFailure(call: Call<Token>, t: Throwable) {
                    onFailure?.invoke(t.localizedMessage ?: t.message ?: t.toString())
                }

                override fun onResponse(call: Call<Token>, response: Response<Token>) {
                    response.body()?.let {
                        with(preferences) {
                            setLoggedIn(true)
                            setLoginCredentials(credentials.toLoginCredntials())
                            setToken(it)
                        }
                    } ?: onFailure?.invoke(response.errorBody()?.string() ?: "Token is null")
                }

            })
        }
        

    }

}