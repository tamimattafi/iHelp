package com.tamimattafi.ihelp.model.list

import com.tamimattafi.ihelp.model.Contacts

data class Volonteer(
    val id: Int,
    val name: String,
    val contacts: Contacts,
    val active: Boolean,
    val description: String,
    val photo: String
)