package com.tamimattafi.ihelp.app.di.modules

import android.content.Context
import android.content.SharedPreferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Singleton @Binds
    abstract fun bindContext(daggerApplication: DaggerApplication) : Context

    @Module
    companion object {
        @JvmStatic
        @Singleton
        @Provides
        fun providePreferences(context: Context) : SharedPreferences = context.getSharedPreferences("iHelp-Preferences", Context.MODE_PRIVATE)
    }

}