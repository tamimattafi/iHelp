package com.tamimattafi.ihelp.app.presentation.mvp.recycler

import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BaseContract
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter


interface MvpRecyclerContract {

    interface RecyclerAdapter<HOLDER : Holder> : PagerRecycler, Refresher {
        var allData : Boolean
        var isLoading : Boolean
        var networkError : Boolean
        var controller: RecyclerController<HOLDER>?
        fun getViewHolder(listPosition : Int) : HOLDER?
        fun setDataCount(dataCount : Int) : Boolean
        fun isEmpty(): Boolean
    }

    interface RecyclerController<HOLDER : Holder> {
        val recycler : RecyclerView
        fun prepare(adapter : RecyclerAdapter<HOLDER>) : Boolean
        fun getViewHolder(position : Int) : HOLDER?
    }

    interface Refresher {
        fun refresh()
        fun tryAgain()
    }

    interface PagerRecycler {
        fun loadMore()
    }

    interface Listener {
        fun onHolderClick(listPosition: Int, adapterPosition : Int, itemId : Int?)
        fun onHolderLongClick(listPosition: Int, adapterPosition: Int, itemId: Int?)
        fun onHolderAction(listPosition: Int, adapterPosition: Int, action: Int, itemId: Int?)
    }

    interface ListenerHolder {
        var listPosition : Int
        var listener : Listener?
    }

    interface Holder : ListenerHolder {
        var objectId : Int?
    }

    interface Object<out ID> {
        fun getObjectId() : ID
    }

    interface Presenter<HOLDER : Holder> : BaseContract.Presenter {
        fun bindViewHolder(holder: HOLDER)
        fun loadMoreRecyclerData()
        fun refresh()
    }

    interface View<HOLDER : Holder> : Listener {
        fun showError(message : String)
        fun getAdapter() : MvpRecyclerContract.RecyclerAdapter<HOLDER>
        fun setRefreshing(refreshing: Boolean)
    }
}