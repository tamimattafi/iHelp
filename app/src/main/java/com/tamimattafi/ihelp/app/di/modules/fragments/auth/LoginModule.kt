package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.LoginScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginPresenter
import com.tamimattafi.ihelp.model.auth.LoginCredentials
import com.tamimattafi.ihelp.model.auth.RegistrationCredentails
import com.tamimattafi.ihelp.repository.auth.AuthContract
import com.tamimattafi.ihelp.repository.auth.LoginRepository
import dagger.Binds
import dagger.Module

@Module
abstract class LoginModule {

    @LoginScope @Binds
    abstract fun bindPresenter(loginPresenter: LoginPresenter) : LoginContract.Presenter


    @LoginScope @Binds
    abstract fun bindView(loginFragment: LoginFragment) : LoginContract.View

    @LoginScope @Binds
    abstract fun bindRepository(loginRepository: LoginRepository) : AuthContract.BaseAuthRepository<LoginCredentials>
}