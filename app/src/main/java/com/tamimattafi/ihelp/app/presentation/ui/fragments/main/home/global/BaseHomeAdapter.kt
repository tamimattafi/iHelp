package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global


import com.tamimattafi.ihelp.app.presentation.custom.holders.empty.EmptyHolderList
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract

abstract class BaseHomeAdapter<HOLDER : MvpRecyclerContract.Holder>(
    presenter: BaseHomeContract.Presenter<HOLDER>,
    listener : BaseHomeContract.View<HOLDER>)
    : BaseHomeContract.Adapter<HOLDER>(presenter, listener) {

    override fun getNoDataHolderType(): Int
            = EmptyHolderList.NO_CONNECTION
}