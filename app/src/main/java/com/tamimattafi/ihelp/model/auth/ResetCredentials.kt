package com.tamimattafi.ihelp.model.auth

import com.tamimattafi.ihelp.model.auth.global.UsernameCredentials

data class ResetCredentials(
    override val username: String
) : UsernameCredentials