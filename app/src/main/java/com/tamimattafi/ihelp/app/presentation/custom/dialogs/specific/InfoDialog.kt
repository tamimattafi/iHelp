package com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.tamimattafi.ihelp.R
import kotlinx.android.synthetic.main.dialog_info.view.*

class InfoDialog(context: Context?) {

    private val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_info, null)
    private val dialog: AlertDialog
    private var cancelListener: CancelListener? = null

    var title: String = ""
        set(value) {
            field = value
            dialogView.label.text = value
        }

    var hint: String = ""
        set(value) {
            field = value
            dialogView.hint.text = value
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

        }

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


    interface CancelListener {
        fun onCancel()
    }
}