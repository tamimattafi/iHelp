package com.tamimattafi.ihelp.app.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.tamimattafi.ihelp.interractor.ApiPaths
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.android.support.DaggerApplication
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Reusable @Binds
    abstract fun bindContext(daggerApplication: DaggerApplication) : Context

    @Module
    companion object {
        @JvmStatic
        @Reusable
        @Provides
        fun providePreferences(context: Context) : SharedPreferences = context.getSharedPreferences("iHelp-Preferences", Context.MODE_PRIVATE)

        @JvmStatic
        @Reusable
        @Provides
        fun provideRetrofit() : Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ApiPaths.BASE_URL).build()

    }

}