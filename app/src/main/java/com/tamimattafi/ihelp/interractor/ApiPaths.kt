package com.tamimattafi.ihelp.interractor

object ApiPaths {

    const val BASE_URL = "http://safe-bastion-88967.herokuapp.com/"

    const val REST_AUTH = "rest-auth"
    const val LOGIN = "$REST_AUTH/login/"

    const val PASSWORD_RESET = "$REST_AUTH/password/reset/"
    const val PASSWORD_CONFIRM = "$PASSWORD_RESET/confirm/"

    const val REGISTRATION = "$REST_AUTH/registration/"
    const val VERIFY_EMAIL = "$REGISTRATION/verify-username/"

}