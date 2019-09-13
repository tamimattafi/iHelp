package com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.base.SelectionDialogContract
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.sub.PairSelectionDialog



/*
class FilterDialog(context: Context, type: Int) {

    private val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_filter, null)
    private val dialog: AlertDialog
    private var saveListener: SaveListener? = null
    private var cancelListener: CancelListener? = null

    private val orderByList: Map<String, String> = PreferencesValues.getOrderByList(context, type)
    private val directionList: Map<String, String> = PreferencesValues.getDirectionList(context)

    private val directionDialog by lazy { PairSelectionDialog(context) }
    private val orderByDialog by lazy { PairSelectionDialog(context) }

    var orderByField: String? = PreferencesValues.OFFER_LAST_MODIFIED
        set(value) {
            field = value
            dialogView.orderBy.hint = orderByList[value]
        }


    var directionField: String? = PreferencesValues.DIRECTION_DESC
        set(value) {
            field = value
            dialogView.direction.hint = directionList[value]
        }

    init {
        AlertDialog.Builder(context).apply {
            setView(dialogView)
            setCancelable(true)
            dialog = create()
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

        dialogView.apply {
            cancel.setOnClickListener {
                cancelListener?.onCancel()
                dismiss()
            }

            save.setOnClickListener {
                saveListener?.onSave(orderByField, directionField)
                dismiss()
            }

            direction.setOnClickListener {
                directionDialog.also {
                    it.bindData(
                        ArrayList(directionList.toList()),
                        object : SelectionDialogContract.ListDialogActionListener<Pair<String, String>> {
                            override fun onItemSelected(item: Pair<String, String>) {
                                directionField = item.first
                                it.dismiss()
                            }

                        })

                    it.show()
                }
            }

            orderBy.setOnClickListener {
                orderByDialog.also {
                    it.bindData(
                        ArrayList(orderByList.toList()),
                        object : SelectionDialogContract.ListDialogActionListener<Pair<String, String>> {
                            override fun onItemSelected(item: Pair<String, String>) {
                                orderByField = item.first
                                it.dismiss()
                            }

                        })

                    it.show()
                }
            }

        }
    }

    fun setSaveListener(saveListener: SaveListener) {
        this.saveListener = saveListener
    }

    fun setCancelListener(cancelListener: CancelListener) {
        this.cancelListener = cancelListener
    }

    fun show() {
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }

    interface SaveListener {
        fun onSave(orderBy: String?, direction: String?)
    }

    interface CancelListener {
        fun onCancel()
    }
}*/
