package com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.tamimattafi.ihelp.R
import kotlinx.android.synthetic.main.dialog_confirmation.view.*


class ConfirmationDialog(context: Context) {

    private val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_confirmation, null)
    private val dialog: AlertDialog
    private var confirmationListener: ConfirmListener? = null
    private var cancelListener: ConfirmationDialogCancelListener? = null

    var title: String? = ""
        set(value) {
            field = value
            dialogView.label.text = value
        }

    var hint: String? = ""
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

            confirm.setOnClickListener {
                confirmationListener?.onConfirm()
                dismiss()
            }

        }

    }

    fun setConfirmListener(confirmationListener: ConfirmListener) {
        this.confirmationListener = confirmationListener
    }

    fun setCancelListener(confirmationListener: ConfirmListener) {
        this.confirmationListener = confirmationListener
    }

    fun show() {
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }

    interface ConfirmListener {
        fun onConfirm()
    }

    interface ConfirmationDialogCancelListener {
        fun onCancel()
    }
}