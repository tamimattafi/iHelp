package com.tamimattafi.ihelp.app.presentation.custom.holders.dialog

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionDialogContract
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.model.MenuItemData
import com.tamimattafi.ihelp.utils.AppUtils
import kotlinx.android.synthetic.main.item_view_holder_grid.view.*

class GridItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
    SelectionDialogContract.SelectionDialogHolder<MenuItemData> {

    lateinit var item: MenuItemData

    override fun bindListeners(listener: SelectionDialogContract.ListDialogActionListener<MenuItemData>) {
        itemView.setOnClickListener {
            listener.onItemSelected(item)
        }
    }

    override fun bindData(item: MenuItemData) {
        this.item = item
        with(itemView) {
            item.apply {
                this@with.label.text = label
                this@with.icon.apply {
                    setImageDrawable(drawable)
                    setColorFilter(AppUtils.getColor(context, drawableColor))
                }
            }
        }
    }

}