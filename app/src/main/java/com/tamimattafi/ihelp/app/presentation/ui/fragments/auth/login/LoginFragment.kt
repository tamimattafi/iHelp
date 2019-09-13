package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login


import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.InfoDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.LoadingDialog
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset.ResetFragment
import com.tamimattafi.ihelp.utils.FormUtils
import kotlinx.android.synthetic.main.fragment_login.*
import javax.inject.Inject

class LoginFragment : NavigationContract.NavigationFragment() , LoginContract.View {

    override var fragmentName: String = "fragment-authenticate"
    override val layoutId: Int = R.layout.fragment_login

    @Inject
    lateinit var presenter: LoginContract.Presenter

    private val errorDialog by lazy {
        InfoDialog(appActivity).apply {
            title = appContext.resources.getString(R.string.logining_error)
        }
    }

    private val loadingDialog by lazy {
        LoadingDialog(appActivity).apply {
            with(appContext.resources) {
                title = getString(R.string.logining_user)
                hint = getString(R.string.please_wait)
            }
        }
    }

    override fun getLogin() = email.text.toString()

    override fun getPassword() = password.text.toString()

    override fun isFormValid(): Boolean = FormUtils.isFormCorrect(email, emailLayout, password, passwordLayout)

    override fun onLoginSuccess() {
        loadingDialog.dismiss()
    }

    override fun setLoading() {
        loadingDialog.show()
    }

    override fun showError(message: String) {
        loadingDialog.dismiss()
        errorDialog.apply {
            hint = message
        }.show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signUp.setOnClickListener {
            navigationManager.requestSlideLeftScreen(RegistrationFragment())
        }

        loginBtn.setOnClickListener {
            presenter.onLoginBtnPressed()
        }

        forgotPasswordLabel.setOnClickListener {
            navigationManager.requestSlideLeftScreen(ResetFragment())
        }
    }

}