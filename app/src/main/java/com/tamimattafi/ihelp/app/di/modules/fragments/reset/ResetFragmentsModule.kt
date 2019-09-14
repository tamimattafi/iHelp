package com.tamimattafi.ihelp.app.di.modules.fragments.reset

import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation.ConfirmationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset.ResetFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ResetFragmentsModule {

    @ContributesAndroidInjector(modules = [ResetModule::class])
    abstract fun resetFragment() : ResetFragment

    @ContributesAndroidInjector(modules = [ConfirmationModule::class])
    abstract fun confirmationFragment() : ConfirmationFragment


}