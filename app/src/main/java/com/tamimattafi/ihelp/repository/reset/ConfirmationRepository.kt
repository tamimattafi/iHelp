package com.tamimattafi.ihelp.repository.reset

import com.tamimattafi.ihelp.model.auth.ConfirmCredentials
import com.tamimattafi.ihelp.repository.reset.global.ResetRepositoryContract
import okhttp3.ResponseBody
import retrofit2.Call
import javax.inject.Inject

class ConfirmationRepository @Inject constructor(): ResetRepositoryContract.BaseResetRepository<ConfirmCredentials>() {

    override fun getResetCall(resetCredentials: ConfirmCredentials): Call<ResponseBody>
            = interractor.confirmReset(resetCredentials.apply { token = preferences.getToken().key })

}