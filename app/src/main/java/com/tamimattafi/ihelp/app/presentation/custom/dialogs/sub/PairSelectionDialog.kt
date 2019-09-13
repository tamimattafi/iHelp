package com.tamimattafi.ihelp.app.presentation.custom.dialogs.sub

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionAdapter
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionDialogContract
import com.tamimattafi.lastochka.app.ui.custom.holders.dialog.SimplePairItemHolder

class PairSelectionDialog(context: Context?) : SelectionDialog<Pair<String, String>, SimplePairItemHolder>(context, 1) {
    override fun getSelectionAdapter(
        data: ArrayList<Pair<String, String>>,
        listener: SelectionDialogContract.ListDialogActionListener<Pair<String, String>>
    ): SelectionAdapter<Pair<String, String>, SimplePairItemHolder> = StringSelectionAdapter(data, listener)

    inner class StringSelectionAdapter(
        data: ArrayList<Pair<String, String>>,
        listener: SelectionDialogContract.ListDialogActionListener<Pair<String, String>>
    ) : SelectionAdapter<Pair<String, String>, SimplePairItemHolder>(data, listener) {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            SimplePairItemHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_view_holder_simple_string,
                    parent,
                    false
                )
            )

    }

}