package com.tamimattafi.ihelp.repository.global

import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainContract
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import javax.inject.Inject


abstract class SimplePreferencesRepository<T> {

    protected var onSuccess: (() -> Unit)? = null
    protected var onFailure: ((message: String) -> Unit)? = null

    @Inject
    protected lateinit var authPreferences : AuthContract.Preferences

    @Inject
    protected lateinit var mainPreferences : MainContract.Preferences

    fun setOnSuccessListener(listener : () -> Unit) : SimplePreferencesRepository<T> {
        onSuccess = listener
        return this
    }

    fun setOnFailureListener(listener: (message : String) -> Unit) : SimplePreferencesRepository<T> {
        onFailure = listener
        return this
    }
}