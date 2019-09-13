package com.tamimattafi.ihelp.app.di.modules

import android.app.Activity
import com.tamimattafi.ihelp.MainActivity
import com.tamimattafi.ihelp.app.di.modules.fragments.auth.AuthFragmentsModule
import com.tamimattafi.ihelp.app.di.modules.fragments.main.MainFragmentsModule
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [AuthFragmentsModule::class, MainFragmentsModule::class])
    abstract fun mainActivity() : MainActivity

    @Reusable @Binds
    abstract fun bindNavigationManager(mainActivity: MainActivity) : NavigationContract.NavigationManager


    @Reusable @Binds
    abstract fun bindActivity(mainActivity: MainActivity) : Activity

}