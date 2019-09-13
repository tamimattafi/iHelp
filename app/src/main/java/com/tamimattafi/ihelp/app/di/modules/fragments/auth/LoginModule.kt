package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginPresenter
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import com.tamimattafi.ihelp.repository.auth.LoginRepository
import dagger.Binds
import dagger.Module

@Module
abstract class LoginModule {

    @Binds
    abstract fun bindPresenter(loginPresenter: LoginPresenter) : LoginContract.Presenter


    @Binds
    abstract fun bindView(loginFragment: LoginFragment) : LoginContract.View

    @Binds
    abstract fun bindRepository(loginRepository: LoginRepository) : AuthContract.BaseAuthRepository<LoginCredentials>
}