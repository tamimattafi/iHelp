package com.tamimattafi.ihelp.model.list

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract
import com.tamimattafi.ihelp.model.Contacts

data class Volunteer(
    val id: Int,
    val name: String,
    val contacts: Contacts,
    val active: Boolean,
    val description: String,
    val photo: String
) : MvpRecyclerContract.Object<Int>  {

    override fun getObjectId(): Int = id

}