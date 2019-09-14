package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeFragment
import com.tamimattafi.ihelp.interractor.auth.AuthService
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import com.tamimattafi.ihelp.repository.auth.global.AuthPreferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.android.ContributesAndroidInjector
import retrofit2.Retrofit

@Module
abstract class AuthFragmentsModule {

    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun loginFragment() : LoginFragment

    @ContributesAndroidInjector(modules = [RegistrationModule::class])
    abstract fun registrationFragment() : RegistrationFragment

    @ContributesAndroidInjector(modules = [WelcomeModule::class])
    abstract fun welcomeFragment() : WelcomeFragment

}