package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset

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
        verify.setOnClickListener {
            presenter.onVerifyBtnPressed()
        }
    }
    override fun isEmailValid() = InputUtils.isEditTextAnEmail(email, emailLayout)

    override fun getEmail() = email.text.toString()

    override fun onEmailSent() {

    }

    override fun showError(message: String) {

    }

}