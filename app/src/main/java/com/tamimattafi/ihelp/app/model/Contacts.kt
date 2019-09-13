package com.tamimattafi.ihelp.app.model

data class Contacts(
    var phone: String,
    var email: String,
    var vk: String = "",
    var instagram: String = "",
    var facebook: String = "",
    var viber: Boolean = false,
    var watsapp: Boolean = false,
    var telegram: Boolean = false
)