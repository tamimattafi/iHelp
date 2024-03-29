package com.tamimattafi.ihelp.app.presentation.mvp.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.holders.empty.EmptyHolder
import com.tamimattafi.ihelp.app.presentation.custom.holders.empty.EmptyHolderList

abstract class MvpRecyclerAdapter<HOLDER : MvpRecyclerContract.Holder>(
    override val presenter: MvpRecyclerContract.Presenter<HOLDER>,
    listener: MvpRecyclerContract.Listener
) : MvpBaseRecyclerAdapter<HOLDER>(presenter, listener),
    MvpRecyclerContract.RecyclerAdapter<HOLDER> {

    override var networkError: Boolean = false

    override fun refresh() {
        dataCount = 0
        prepare()
        presenter.refresh()
    }

    override fun tryAgain() {
        prepare()
        presenter.loadMoreRecyclerData()
    }

    private fun prepare() {
        isLoading = false
        allData = false
        networkError = false
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        with(LayoutInflater.from(parent.context)) {
            return when {
                viewType == ITEM_NO_DATA && networkError -> getNoDataHolder(
                    parent,
                    EmptyHolderList.NO_CONNECTION
                )
                viewType == ITEM_LOADING_ERROR -> EmptyHolder(
                    EmptyHolderList.getItem(parent.context, EmptyHolderList.TRY_AGAIN),
                    inflate(
                        R.layout.item_view_holder_bottom_error,
                        parent,
                        false
                    )
                )
                else -> super.onCreateViewHolder(parent, viewType)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            dataCount == 0 && networkError -> ITEM_NO_DATA
            dataCount > 0 && position == dataCount + headersCount + footersCount && networkError -> ITEM_LOADING_ERROR
            else -> super.getItemViewType(position)
        }
    }

}