package com.tamimattafi.ihelp.app.model


data class Organisation(
    val id: Int,
    val name: String,
    val description: String,
    val contacts: Contacts,
    val logo: String,
    val ownerId: Int,
    val country: String = "",
    val city: String = "",
    val adress: String = ""
)