package com.tamimattafi.ihelp.app.di.modules

import android.app.Activity
import com.tamimattafi.ihelp.MainActivity
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun mainActivity() : MainActivity

    @Binds
    abstract fun bindNavigationManager(mainActivity: MainActivity) : NavigationContract.NavigationManager


    @Binds
    abstract fun bindActivity(mainActivity: MainActivity) : Activity

}