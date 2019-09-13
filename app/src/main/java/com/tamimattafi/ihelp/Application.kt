package com.tamimattafi.ihelp

import com.tamimattafi.ihelp.app.di.components.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class Application : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
       = DaggerApplicationComponent.builder().application(this).build()

}