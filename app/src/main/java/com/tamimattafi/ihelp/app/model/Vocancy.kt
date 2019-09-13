package com.tamimattafi.ihelp.app.model

data class Vocancy(
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