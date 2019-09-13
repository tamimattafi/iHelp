package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.LoginScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class LoginModule {

    @LoginScope @Binds
    abstract fun bindPresenter(loginPresenter: LoginPresenter) : LoginContract.Presenter


    @LoginScope @Binds
    abstract fun bindView(loginFragment: LoginFragment) : LoginContract.View
}