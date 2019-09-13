package com.tamimattafi.ihelp.app.di.modules.fragments.main

import androidx.fragment.app.FragmentManager
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainManager
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainPreferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
abstract class MainModule {

    @Binds
    abstract fun bindManager(mainManager: MainManager) : MainContract.Manager

    @Binds
    abstract fun bindPreferences(mainPreferences: MainPreferences) : MainContract.Preferences

    @Module
    companion object {
        @JvmStatic
        @Reusable
        @Provides
        fun provideFragmentManager(mainFragment: MainFragment) : FragmentManager = mainFragment.childFragmentManager
    }
}