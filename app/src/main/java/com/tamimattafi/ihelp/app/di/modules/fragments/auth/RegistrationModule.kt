package com.tamimattafi.ihelp.app.di.modules.fragments.auth

import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationPresenter
import com.tamimattafi.ihelp.model.auth.RegistrationCredentials
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import com.tamimattafi.ihelp.repository.auth.RegistrationRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RegistrationModule {

    @Binds
    abstract fun bindPresenter(registrationPresenter: RegistrationPresenter) : RegistrationContract.Presenter

    @Binds
    abstract fun bindView(registrationFragment: RegistrationFragment) : RegistrationContract.View

    @Binds
    abstract fun bindRepository(registrationRepository: RegistrationRepository) : AuthContract.BaseAuthRepository<RegistrationCredentials>

}