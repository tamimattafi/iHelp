package com.tamimattafi.ihelp.model.list

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract
import com.tamimattafi.ihelp.model.Contacts


data class Organisation(
    val id: Int,
    val name: String,
    val description: String,
    val contacts: Contacts,
    val logo: String,
    val ownerId: Int,
    val country: String = "",
    val city: String = "",
    val address: String = ""
) : MvpRecyclerContract.Object<Int> {

    override fun getObjectId(): Int = id

}