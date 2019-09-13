package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

class MenuPresenter @Inject constructor(view : MenuContract.View) : BasePresenter<MenuContract.View>(view) ,
    MenuContract.Presenter {
}