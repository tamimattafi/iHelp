package com.tamimattafi.ihelp.app.di.modules.fragments.reset

import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset.ResetContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset.ResetFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset.ResetPresenter
import com.tamimattafi.ihelp.model.auth.ResetCredentials
import com.tamimattafi.ihelp.repository.reset.ResetRepository
import com.tamimattafi.ihelp.repository.reset.global.ResetRepositoryContract
import dagger.Binds
import dagger.Module

@Module
abstract class ResetModule {

    @Binds
    abstract fun bindPresenter(resetPresenter: ResetPresenter) : ResetContract.Presenter


    @Binds
    abstract fun bindView(resetFragment: ResetFragment) : ResetContract.View

    @Binds
    abstract fun bindRepository(resetRepository: ResetRepository) : ResetRepositoryContract.BaseResetRepository<ResetCredentials>
}