package com.tamimattafi.ihelp.app.presentation.custom.dialogs.sub

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.BottomSelectionDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionAdapter
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionDialogContract
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.model.MenuItemData
import com.tamimattafi.ihelp.app.presentation.custom.holders.dialog.GridItemHolder

open class GridBottomSelectionDialog(context: Context, spanSize: Int) :
    BottomSelectionDialog<MenuItemData, GridItemHolder>(context, spanSize) {

    override fun getSelectionAdapter(
        data: ArrayList<MenuItemData>,
        listener: SelectionDialogContract.ListDialogActionListener<MenuItemData>
    ): SelectionAdapter<MenuItemData, GridItemHolder> = GridSelectionAdapter(data, listener)

    inner class GridSelectionAdapter(
        data: ArrayList<MenuItemData>,
        listener: SelectionDialogContract.ListDialogActionListener<MenuItemData>
    ) : SelectionAdapter<MenuItemData, GridItemHolder>(data, listener) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = GridItemHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.item_view_holder_grid,
                    parent,
                    false
                )
        )

    }
}