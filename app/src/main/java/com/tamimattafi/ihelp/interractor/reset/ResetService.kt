package com.tamimattafi.ihelp.interractor.reset

import com.tamimattafi.ihelp.interractor.ApiPaths
import com.tamimattafi.ihelp.model.auth.ConfirmCredentials
import com.tamimattafi.ihelp.model.auth.ResetCredentials
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ResetService {

    @POST(ApiPaths.PASSWORD_RESET)
    fun resetPassword(@Body resetCredentials: ResetCredentials) : Call<ResponseBody>

    @POST(ApiPaths.PASSWORD_CONFIRM)
    fun confirmReset(@Body confirmCredentials: ConfirmCredentials) : Call<ResponseBody>
}