package com.tamimattafi.ihelp.model.auth

import com.tamimattafi.ihelp.model.auth.global.BaseCredentials

data class LoginCredentials(
    override val username: String,
    override val password: String
) : BaseCredentials