package com.tamimattafi.ihelp.app.presentation.mvp.fragment

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerAdapter
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract

interface MvpRecyclerFragmentContract {

    interface Presenter<HOLDER : MvpRecyclerContract.Holder> : MvpRecyclerContract.Presenter<HOLDER>

    interface View<HOLDER : MvpRecyclerContract.Holder> : MvpRecyclerContract.View<HOLDER> , MvpRecyclerContract.Listener

    abstract class Adapter<HOLDER : MvpRecyclerContract.Holder>(
        presenter: MvpRecyclerContract.Presenter<HOLDER>,
        listener: MvpRecyclerContract.Listener
    ) : MvpRecyclerAdapter<HOLDER>(presenter, listener)
}