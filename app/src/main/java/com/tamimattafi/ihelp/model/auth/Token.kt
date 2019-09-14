package com.tamimattafi.ihelp.model.auth

data class Token(
    val key : String,
    val  volunteer : Boolean? = null
)