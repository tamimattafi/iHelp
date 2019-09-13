package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.LoginScope
import com.tamimattafi.ihelp.app.di.scopes.RegistrationScope
import com.tamimattafi.ihelp.app.di.scopes.WelcomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentsModule {

    @LoginScope
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun loginFragment() : LoginFragment


    @RegistrationScope
    @ContributesAndroidInjector(modules = [RegistrationModule::class])
    abstract fun registrationFragment() : RegistrationFragment

    @WelcomeScope
    @ContributesAndroidInjector(modules = [WelcomeModule::class])
    abstract fun welcomeFragment() : WelcomeFragment

}