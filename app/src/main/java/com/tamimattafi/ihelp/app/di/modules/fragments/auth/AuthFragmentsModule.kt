package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.LoginScope
import com.tamimattafi.ihelp.app.di.scopes.RegistrationScope
import com.tamimattafi.ihelp.app.di.scopes.WelcomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login.LoginFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeFragment
import com.tamimattafi.ihelp.interractor.ApiPaths
import com.tamimattafi.ihelp.interractor.AuthService
import com.tamimattafi.ihelp.repository.auth.AuthContract
import com.tamimattafi.ihelp.repository.auth.AuthPreferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.android.ContributesAndroidInjector
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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


    @Module
    companion object {
        @JvmStatic
        @Provides
        @Reusable
        fun provideAuthService(retrofit: Retrofit) : AuthService = retrofit.create(AuthService::class.java)
    }

    @Binds @Reusable
    abstract fun bindPreferences(authPreferences: AuthPreferences) : AuthContract.Preferences

}