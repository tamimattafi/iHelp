package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.utils.AppUtils
import com.tamimattafi.ihelp.utils.FormUtils
import kotlinx.android.synthetic.main.fragment_registration.*
import javax.inject.Inject

class RegistrationFragment : NavigationContract.NavigationFragment() , RegistrationContract.View {

    override var fragmentName: String = "fragment-registration"
    override val layoutId: Int = R.layout.fragment_registration

    @Inject
    lateinit var presenter: RegistrationContract.Presenter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        registerBtn.setOnClickListener {
            presenter.onRegisterBtnPressed()
        }
    }

    override fun onRegisterSuccess() {

    }

    override fun showError(message: String) {
        AppUtils.showToast(context!!, "Error")
    }

    override fun isFormValid() = FormUtils.isFormCorrect(username, usernameLayout,
        email, emailLayout,
        password, passwordLayout)

    override fun getUsername() = username.text.toString()

    override fun getEmail() = email.text.toString()

    override fun getPassword() = password.text.toString()
}