package com.tamimattafi.ihelp.model.auth

import com.tamimattafi.ihelp.model.auth.global.BaseCredentials

data class LoginCredentials(
    override val email: String,
    override val password: String
) : BaseCredentials