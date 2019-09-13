package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.RegistrationScope
import com.tamimattafi.ihelp.app.di.scopes.WelcomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationPresenter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomePresenter
import dagger.Binds
import dagger.Module

@Module
abstract class WelcomeModule {

    @WelcomeScope @Binds
    abstract fun bindPresenter(welcomePresenter : WelcomePresenter) : WelcomeContract.Presenter


    @WelcomeScope @Binds
    abstract fun bindView(welcomeFragment: WelcomeFragment) : WelcomeContract.View
}