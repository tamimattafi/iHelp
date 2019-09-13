package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.confirmation

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.InfoDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.LoadingDialog
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation.ConfirmationContract
import javax.inject.Inject

class ConfirmationFragment : NavigationContract.NavigationFragment() , ConfirmationContract.View {

    override var fragmentName: String = "fragment-confirmation"
    override val layoutId: Int = R.layout.fragment_confirmation

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

    @Inject
    lateinit var presenter : ConfirmationContract.Presenter

    override fun onConfirmSuccess() {

    }

    override fun showError(message: String) {
        loadingDialog.dismiss()
        errorDialog.apply {
            hint = message
        }.show()
    }

    override fun isFormValid(): Boolean = false

    override fun getFirstPassword(): String = ""

    override fun getSecondPassword(): String = ""










}