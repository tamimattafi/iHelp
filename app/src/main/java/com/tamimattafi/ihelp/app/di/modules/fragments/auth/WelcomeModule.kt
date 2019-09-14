package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomePresenter
import dagger.Binds
import dagger.Module

@Module
abstract class WelcomeModule {

    @Binds
    abstract fun bindPresenter(welcomePresenter : WelcomePresenter) : WelcomeContract.Presenter

    @Binds
    abstract fun bindView(welcomeFragment: WelcomeFragment) : WelcomeContract.View
}