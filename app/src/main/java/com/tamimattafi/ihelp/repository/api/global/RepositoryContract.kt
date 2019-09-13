package com.tamimattafi.ihelp.repository.api.global

import retrofit2.Call
import com.tamimattafi.ihelp.interractor.list.ListService
import com.tamimattafi.ihelp.model.list.ListPage
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

interface RepositoryContract {

    interface Base<T> {
        var paginationSize: Int
        var currentCount: Int
        fun refresh()
        fun getNextPage() : Base<T>
        fun destroy()
        fun stopListening()
    }

    abstract class RepositoryBase<T> : Base<T> {

        private var onListComplete: ((it: List<T>) -> Unit)? = null
        private var onFailure: ((message: String) -> Unit)? = null

        override var currentCount: Int = 0

        @Inject
        lateinit var interractor : ListService

        override fun stopListening() {
            onListComplete = null
        }

        override fun getNextPage(): RepositoryBase<T> {
            getListCall().enqueue(object : Callback<ListPage<T>> {
                override fun onFailure(call: Call<ListPage<T>>, t: Throwable) {
                    onFailure?.invoke(t.localizedMessage ?: t.message ?: t.toString())
                }

                override fun onResponse(call: Call<ListPage<T>>, response: Response<ListPage<T>>) {
                    response.body()?.let {
                        onListComplete?.invoke(it.list)
                    } ?: response.errorBody()?.let {
                        onFailure?.invoke(it.string() ?: "Something went wrong")
                    }
                }

            })

            return this
        }

        abstract fun getListCall() : Call<ListPage<T>>

        override fun destroy() {
            stopListening()
            currentCount = 0
        }

        fun setOnListCompleteListener(listener : (it: List<T>) -> Unit) : RepositoryBase<T> {
            onListComplete = listener
            return this
        }

        fun setOnFailureListener(listener : (message: String) -> Unit) : RepositoryBase<T> {
            onFailure = listener
            return this
        }

    }

}