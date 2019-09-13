package com.tamimattafi.ihelp.app.presentation.mvp.presenter

abstract class BasePresenter<V>(protected val view : V) {

    protected var isViewDestroyed : Boolean = false


    open fun onDestroyView() {
        isViewDestroyed = true
    }

    open fun onDestroy() {}
}