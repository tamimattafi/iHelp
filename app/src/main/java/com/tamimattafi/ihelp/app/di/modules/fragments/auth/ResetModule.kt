package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset.ResetContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset.ResetFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset.ResetPresenter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome.WelcomePresenter
import dagger.Binds
import dagger.Module

@Module
abstract class ResetModule {

    @Binds
    abstract fun bindPresenter(resetPresenter: ResetPresenter) : ResetContract.Presenter


    @Binds
    abstract fun bindView(resetFragment: ResetFragment) : ResetContract.View
}