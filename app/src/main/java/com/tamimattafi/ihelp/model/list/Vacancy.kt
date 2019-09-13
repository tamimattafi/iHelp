package com.tamimattafi.ihelp.model.list

data class Vacancy(
    val id: Int,
    val dateRange: String,
    val eventName: String,
    val name: String,
    val description: String,
    val professionType: Boolean,
    val organizationCategory: String
) {
    /*companion object ProfessionTypes {
        const val social = "SOCIAL"
        const val medic = "MEDIC"
        const val psychological = "PSYCHOLOGICAL"
        const val educational = "EDUCATIONAL"
        const val jobs = "JOBS"
    }*/
}