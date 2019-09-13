package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.RegistrationScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class RegistrationModule {

    @RegistrationScope @Binds
    abstract fun bindPresenter(registrationPresenter: RegistrationPresenter) : RegistrationContract.Presenter


    @RegistrationScope @Binds
    abstract fun bindView(registrationFragment: RegistrationFragment) : RegistrationContract.View
}