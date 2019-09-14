package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeAdapter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeContract

interface OrganizationHomeContract {

     interface Presenter : BaseHomeContract.Presenter<Holder>

    interface View : BaseHomeContract.View<Holder>

    abstract class Adapter(presenter : Presenter, listener : View) : BaseHomeAdapter<Holder>(presenter, listener)

    interface Holder : MvpRecyclerContract.Holder {
        fun setName(name : String)
        fun setDescription(description : String)
        fun setProfession(profession : String)
        fun setOrganization(organization : String)
        fun setDate(date : String)
    }
}