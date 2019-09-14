package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeAdapter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeContract

interface VolunteerHomeContract {

    interface Presenter : BaseHomeContract.Presenter<Holder>

    interface View : BaseHomeContract.View<Holder>

    abstract class Adapter(presenter : Presenter, listener : View) : BaseHomeAdapter<Holder>(presenter, listener)

    interface Holder : MvpRecyclerContract.Holder {
        fun setName(name : String)
        fun setEmail(description : String)
        fun setActive(isActive : Boolean)
        fun setPicture(picture : String)
    }
}