package com.tamimattafi.ihelp.model.auth

data class LoginCredentials(
    override var email: String,
    override var password: String
) : BaseCredentials