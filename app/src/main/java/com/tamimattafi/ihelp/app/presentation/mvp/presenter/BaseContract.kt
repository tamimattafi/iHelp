package com.tamimattafi.ihelp.app.presentation.mvp.presenter

interface BaseContract {

    interface Presenter {
        fun onDestroyView()
        fun onDestroy()
    }
}