package com.tamimattafi.ihelp.repository.reset

import com.tamimattafi.ihelp.model.auth.ResetCredentials
import com.tamimattafi.ihelp.repository.reset.global.ResetRepositoryContract
import okhttp3.ResponseBody
import retrofit2.Call
import javax.inject.Inject

class ResetRepository @Inject constructor() : ResetRepositoryContract.BaseResetRepository<ResetCredentials>() {

    override fun getResetCall(resetCredentials: ResetCredentials): Call<ResponseBody>
            = interractor.resetPassword(resetCredentials)

}
