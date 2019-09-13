package com.tamimattafi.ihelp.app.model

import com.tamimattafi.ihelp.app.model.Contacts

data class Volonteer(
    val id: Int,
    val name: String,
    val contacts: Contacts,
    val active: Boolean,
    val description: String,
    val photo: String
)