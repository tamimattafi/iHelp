package com.tamimattafi.lastochka.app.ui.custom.holders.dialog

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionDialogContract
import kotlinx.android.synthetic.main.item_view_holder_simple_string.view.*

class SimplePairItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
    SelectionDialogContract.SelectionDialogHolder<Pair<String, String>> {

    lateinit var item: Pair<String, String>

    override fun bindData(item: Pair<String, String>) {
        this.item = item
        itemView.text.text = item.second
    }

    override fun bindListeners(listener: SelectionDialogContract.ListDialogActionListener<Pair<String, String>>) {
        itemView.setOnClickListener {
            listener.onItemSelected(item)
        }
    }


}