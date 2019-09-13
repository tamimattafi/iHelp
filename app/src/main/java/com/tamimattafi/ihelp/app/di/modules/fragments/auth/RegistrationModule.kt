package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.di.scopes.RegistrationScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationPresenter
import com.tamimattafi.ihelp.model.auth.RegistrationCredentails
import com.tamimattafi.ihelp.repository.auth.AuthContract
import com.tamimattafi.ihelp.repository.auth.RegistrationRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RegistrationModule {

    @RegistrationScope @Binds
    abstract fun bindPresenter(registrationPresenter: RegistrationPresenter) : RegistrationContract.Presenter

    @RegistrationScope @Binds
    abstract fun bindView(registrationFragment: RegistrationFragment) : RegistrationContract.View

    @RegistrationScope @Binds
    abstract fun bindRepository(registrationRepository: RegistrationRepository) : AuthContract.BaseAuthRepository<RegistrationCredentails>

}