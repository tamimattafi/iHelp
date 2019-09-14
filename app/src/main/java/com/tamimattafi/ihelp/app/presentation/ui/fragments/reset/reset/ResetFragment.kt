package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.ConfirmationDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.InfoDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.LoadingDialog
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.utils.InputUtils
import kotlinx.android.synthetic.main.fragment_reset.*
import javax.inject.Inject

class ResetFragment : NavigationContract.NavigationFragment() , ResetContract.View {

    override var fragmentName: String = "fragment-reset"
    override val layoutId: Int = R.layout.fragment_reset

    @Inject
    lateinit var presenter: ResetContract.Presenter

    private val confirmationDialog by lazy {
        ConfirmationDialog(appActivity).apply {
            with(appContext.resources) {
                title = getString(R.string.request_sent)
                hint = getString(R.string.check_your_mail)
            }

            setConfirmListener(object : ConfirmationDialog.ConfirmListener {
                override fun onConfirm() {
                    navigationManager.requestBackPress()
                }
            })
        }
    }

    private val loadingDialog by lazy {
        LoadingDialog(appActivity).apply {
            with(appContext.resources) {
                title = getString(R.string.sending_request)
                hint = getString(R.string.please_wait)
            }
        }
    }

    private val errorDialog by lazy {
        InfoDialog(appActivity).apply {
            title = appContext.resources.getString(R.string.reset_request_failed)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        verify.setOnClickListener {
            presenter.onVerifyBtnPressed()
        }
    }
    override fun isEmailValid() = InputUtils.isEditTextAnEmail(username, usernameLayout)

    override fun getEmail() = username.text.toString()

    override fun onEmailSent() {
        loadingDialog.dismiss()
        confirmationDialog.show()
    }

    override fun showError(message: String) {
        loadingDialog.dismiss()
        errorDialog.apply {
            hint = message
        }.show()
    }

    override fun showLoading() {
        loadingDialog.show()
    }
}