package com.tamimattafi.ihelp.model.list

import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerContract

data class Vacancy(
    val id: Int,
    val dateRange: String,
    val eventName: String,
    val name: String,
    val description: String,
    val professionType: String,
    val organizationCategory: String
) : MvpRecyclerContract.Object<Int> {
    override fun getObjectId(): Int = id
    /*companion object ProfessionTypes {
        const val social = "SOCIAL"
        const val medic = "MEDIC"
        const val psychological = "PSYCHOLOGICAL"
        const val educational = "EDUCATIONAL"
        const val jobs = "JOBS"
    }*/
}