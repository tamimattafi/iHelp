package com.tamimattafi.ihelp.repository.auth

import android.content.SharedPreferences
import com.google.gson.Gson
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.Token
import javax.inject.Inject

class AuthPreferences @Inject constructor(private val preferences: SharedPreferences) : AuthContract.Preferences {

    override fun isLoggedIn() : Boolean = preferences.getBoolean(LOGGED_IN, false)

    override fun setLoggedIn(loggedIn : Boolean)  = with(preferences.edit()) {
        putBoolean(LOGGED_IN, loggedIn)
        apply()
    }

    override fun getLoginCredentials() : LoginCredentials? = Gson().fromJson(preferences.getString(CREDENTIALS, null), LoginCredentials::class.java)

    override fun setLoginCredentials(credentials: LoginCredentials) = with(preferences.edit()) {
        putString(CREDENTIALS, Gson().toJson(credentials))
        apply()
    }

    override fun setToken(token: Token) = with(preferences.edit()) {
        putString(TOKEN, Gson().toJson(token))
        apply()
    }

    override fun getToken(): Token? = Gson().fromJson(preferences.getString(TOKEN, null), Token::class.java)

    companion object {
        const val LOGGED_IN = "loggedIn"
        const val CREDENTIALS = "credentials"
        const val TOKEN = "token"
    }

}