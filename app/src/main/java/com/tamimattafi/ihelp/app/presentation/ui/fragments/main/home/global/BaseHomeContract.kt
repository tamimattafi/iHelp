package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global

import com.tamimattafi.ihelp.app.presentation.mvp.fragment.MvpRecyclerFragmentContract
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerAdapter
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract

interface BaseHomeContract {

    interface  Presenter<HOLDER : MvpRecyclerContract.Holder> : MvpRecyclerFragmentContract.Presenter<HOLDER>

    interface View<HOLDER : MvpRecyclerContract.Holder> : MvpRecyclerContract.View<HOLDER>

    abstract class Adapter<HOLDER : MvpRecyclerContract.Holder>(
        presenter: MvpRecyclerContract.Presenter<HOLDER>,
        listener: MvpRecyclerContract.Listener
    ) : MvpRecyclerFragmentContract.Adapter<HOLDER>(presenter, listener)
}