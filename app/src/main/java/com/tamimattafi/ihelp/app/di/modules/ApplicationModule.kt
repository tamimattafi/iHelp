package com.tamimattafi.ihelp.app.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.tamimattafi.ihelp.interractor.ApiPaths
import com.tamimattafi.ihelp.interractor.CacheInterceptor
import com.tamimattafi.ihelp.interractor.auth.AuthInterceptor
import com.tamimattafi.ihelp.interractor.auth.AuthService
import com.tamimattafi.ihelp.interractor.list.ListService
import com.tamimattafi.ihelp.interractor.reset.ResetService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.android.support.DaggerApplication
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
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
        fun provideRetrofitBuilder() : Retrofit.Builder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ApiPaths.BASE_URL)

        @JvmStatic
        @Provides
        fun provideHttpClient(cashInterceptor: CacheInterceptor, authInterceptor: AuthInterceptor): OkHttpClient =
            OkHttpClient.Builder()
                .cache(cashInterceptor.cash)
                .addInterceptor(cashInterceptor)
                .addInterceptor(authInterceptor)
                .readTimeout(25, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build()

        @JvmStatic
        @Provides
        @Reusable
        fun provideAuthService(retrofitBuilder: Retrofit.Builder) : AuthService
                = retrofitBuilder.build()
                    .create(AuthService::class.java)

        @JvmStatic
        @Provides
        @Reusable
        fun provideResetService(retrofitBuilder: Retrofit.Builder, client: OkHttpClient) : ResetService
                = retrofitBuilder.client(client)
                    .build()
                    .create(ResetService::class.java)

        @JvmStatic
        @Provides
        @Reusable
        fun provideListService(retrofitBuilder: Retrofit.Builder, client: OkHttpClient) : ListService
                = retrofitBuilder.client(client)
                    .build()
                    .create(ListService::class.java)



    }

}