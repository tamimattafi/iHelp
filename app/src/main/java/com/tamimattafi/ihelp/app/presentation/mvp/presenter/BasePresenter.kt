package com.tamimattafi.ihelp.app.presentation.mvp.presenter

abstract class BasePresenter<V>(protected open val view : V) : BaseContract.Presenter {

    protected var isViewDestroyed : Boolean = false


    override fun onDestroyView() {
        isViewDestroyed = true
    }

    override fun onDestroy() {}
}