package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.login


import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.InfoDialog
import com.tamimattafi.ihelp.app.presentation.custom.dialogs.specific.LoadingDialog
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration.RegistrationFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset.ResetFragment
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

    override fun getLogin() = username.text.toString()

    override fun getPassword() = password.text.toString()

    override fun isFormValid(): Boolean = FormUtils.isUsernameFormCorrect(username, usernameLayout, password, passwordLayout)

    override fun onLoginSuccess() {
        loadingDialog.dismiss()
        navigationManager.requestAttachBaseScreen(MainFragment())
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
        register.setOnClickListener {
            navigationManager.requestSlideLeftScreen(RegistrationFragment())
        }

        login.setOnClickListener {
            presenter.onLoginBtnPressed()
        }

        reset.setOnClickListener {
            navigationManager.requestSlideLeftScreen(ResetFragment())
        }
    }

}