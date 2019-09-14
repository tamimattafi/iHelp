package com.tamimattafi.ihelp.interractor

import android.content.Context
import com.tamimattafi.ihelp.utils.PhoneUtils
import dagger.Reusable
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

@Reusable
class CacheInterceptor @Inject constructor(private val context: Context) : Interceptor {

    var cash: Cache = Cache(context.cacheDir, 5 * 1024 * 1024)

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        request = if (PhoneUtils.isConnected(context)) {
            request.newBuilder()
                .header("Cache-Control", "public, max-age=" + 5)
                .build()
        } else {
            request.newBuilder()
                .header("Cache-Control", "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7)
                .build()
        }

        return chain.proceed(request)
    }
}