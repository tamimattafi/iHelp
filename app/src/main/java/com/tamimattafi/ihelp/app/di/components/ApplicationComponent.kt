package com.tamimattafi.ihelp.app.di.components

import com.tamimattafi.ihelp.app.di.modules.ActivityModule
import com.tamimattafi.ihelp.app.di.modules.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@Component(modules = [ApplicationModule::class, ActivityModule::class, AndroidSupportInjectionModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    override fun inject(instance: DaggerApplication?)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(daggerApplication: DaggerApplication) : Builder

        fun build() : ApplicationComponent
    }
}