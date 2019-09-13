package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.confirmation

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.InfoDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.LoadingDialog
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.utils.InputUtils
import kotlinx.android.synthetic.main.fragment_confirmation.*
import javax.inject.Inject

class ConfirmationFragment : NavigationContract.NavigationFragment() , ConfirmationContract.View {

    override var fragmentName: String = "fragment-confirmation"
    override val layoutId: Int = R.layout.fragment_confirmation

    @Inject
    lateinit var presenter : ConfirmationContract.Presenter

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        done.setOnClickListener {
            presenter.onOkBtnPressed()
        }
    }

    override fun getNewPassword() = newPassword.text.toString()

    override fun getRepeatNewPassword() = repeatPassword.text.toString()

    override fun isPasswordsValid() = InputUtils.isEditTextValidPassword(newPassword, newPasswordLayout) &&
            InputUtils.isPasswordsMatch(newPassword, repeatPassword, repeatPasswordLayout)


    override fun setLoading() = loadingDialog.show()

    override fun showError(message: String) {
        loadingDialog.dismiss()
        errorDialog.apply {
            hint = message
        }.show()
    }


}