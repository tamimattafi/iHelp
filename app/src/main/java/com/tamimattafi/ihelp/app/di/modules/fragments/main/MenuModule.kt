package com.tamimattafi.ihelp.app.di.modules.fragments.main

import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu.MenuContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu.MenuFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu.MenuPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class MenuModule {

    @Binds
    abstract fun bindView(menuFragment: MenuFragment) : MenuContract.View

    @Binds
    abstract fun bindPresenter(menuPresenter: MenuPresenter) : MenuContract.Presenter
}