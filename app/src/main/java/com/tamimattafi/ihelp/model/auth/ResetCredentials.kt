package com.tamimattafi.ihelp.model.auth

import com.tamimattafi.ihelp.model.auth.global.EmailCredentials

data class ResetCredentials(
    override val email: String
) : EmailCredentials