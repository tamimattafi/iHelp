package com.tamimattafi.ihelp.repository.reset.global

import com.tamimattafi.ihelp.interractor.reset.ResetService
import com.tamimattafi.ihelp.repository.global.SimplePreferencesRepository
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

interface ResetRepositoryContract {

    abstract class Base<T> : SimplePreferencesRepository<T>() {
        abstract fun reset(resetCredentials : T) : SimplePreferencesRepository<T>
    }

    abstract class BaseResetRepository<T> : Base<T>() {

        @Inject
        protected lateinit var interractor : ResetService

        protected abstract fun getResetCall(resetCredentials : T) : Call<ResponseBody>

        override fun reset(resetCredentials: T) : BaseResetRepository<T> {
            getResetCall(resetCredentials).enqueue(object : Callback<ResponseBody> {
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    onFailure?.invoke(t.localizedMessage ?: t.message ?: t.toString())
                }

                override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                    response.body()?.let {
                        onSuccess?.invoke()
                    } ?: onFailure?.invoke(response.errorBody()?.string() ?: "Body is null")
                }

            })

            return this
        }
    }
}