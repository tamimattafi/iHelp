package com.tamimattafi.ihelp.app.di.modules.fragments.reset

import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.confirmation.ConfirmationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation.ConfirmationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation.ConfirmationPresenter
import com.tamimattafi.ihelp.model.auth.ConfirmCredentials
import com.tamimattafi.ihelp.repository.reset.ConfirmationRepository
import com.tamimattafi.ihelp.repository.reset.global.ResetRepositoryContract
import dagger.Binds
import dagger.Module

@Module
abstract class ConfirmationModule {

    @Binds
    abstract fun bindPresenter(confirmationPresenter: ConfirmationPresenter) : ConfirmationContract.Presenter


    @Binds
    abstract fun bindView(confirmationFragment: ConfirmationFragment) : ConfirmationContract.View

    @Binds
    abstract fun bindRepository(confirmationRepository: ConfirmationRepository) : ResetRepositoryContract.BaseResetRepository<ConfirmCredentials>
}