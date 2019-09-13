package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerAdapter
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract

interface BaseHomeContract {

    interface Presenter<HOLDER : MvpRecyclerContract.Holder> : MvpRecyclerContract.Presenter<HOLDER>

    interface View : MvpRecyclerContract.Listener


    abstract class Adapter<HOLDER : MvpRecyclerContract.Holder>(
        presenter: MvpRecyclerContract.Presenter<HOLDER>,
        listener: MvpRecyclerContract.Listener
    ) : MvpRecyclerAdapter<HOLDER>(presenter, listener)
}