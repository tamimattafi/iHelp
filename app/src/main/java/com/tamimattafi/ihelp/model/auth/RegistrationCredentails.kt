package com.tamimattafi.ihelp.model.auth

data class RegistrationCredentails(
    var username : String,
    override var email: String,
    override var password: String
) : BaseCredentials