package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.utils.InputUtils
import kotlinx.android.synthetic.main.fragment_reset.*
import javax.inject.Inject

class ResetFragment : NavigationContract.NavigationFragment() , ResetContract.View {

    override var fragmentName: String = "fragment-reset"
    override val layoutId: Int = R.layout.fragment_reset

    @Inject
    lateinit var presenter: ResetContract.Presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sendCodeBtn.setOnClickListener {
            presenter.onSendBtnPressed()
        }
    }

    override fun setCodeAwaitingMode() {
        sendCodeBtn.isEnabled = false
        verifyCodeBtn.isEnabled = true
    }

    override fun isEmailValid() = InputUtils.isEditTextAnEmail(email, emailLayout)

    override fun getEmail() = email.text.toString()

    override fun getCode() = code.text.toString()

}