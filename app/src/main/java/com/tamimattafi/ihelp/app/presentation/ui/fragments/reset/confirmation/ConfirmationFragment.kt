package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.ConfirmationDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.InfoDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.LoadingDialog
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import kotlinx.android.synthetic.main.dialog_confirmation.*
import javax.inject.Inject

class ConfirmationFragment : NavigationContract.NavigationFragment() , ConfirmationContract.View {

    override var fragmentName: String = "fragment-confirmation"
    override val layoutId: Int = R.layout.fragment_confirmation

    @Inject
    lateinit var presenter : ConfirmationContract.Presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        confirm.setOnClickListener {
            presenter.onConfirmBtnClick()
        }
    }

    private val confirmationDialog by lazy {
        ConfirmationDialog(appActivity).apply {
            with(appContext.resources) {
                title = getString(R.string.done)
                hint = getString(R.string.check_your_mail)
            }
        }
    }

    private val loadingDialog by lazy {
        LoadingDialog(appActivity).apply {
            with(appContext.resources) {
                title = getString(R.string.changing_password)
                hint = getString(R.string.please_wait)
            }
        }
    }

    private val errorDialog by lazy {
        InfoDialog(appActivity).apply {
            title = appContext.resources.getString(R.string.changing_password_error)
        }
    }

    override fun onConfirmSuccess() {
        loadingDialog.dismiss()
        errorDialog.dismiss()
        confirmationDialog.show()
    }

    override fun showError(message: String) {
        loadingDialog.dismiss()
        errorDialog.apply {
            hint = message
        }.show()
    }

    override fun showLoading() {
        errorDialog.dismiss()
        loadingDialog.show()
    }

    override fun isFormValid(): Boolean = false

    override fun getFirstPassword(): String = ""

    override fun getSecondPassword(): String = ""










}