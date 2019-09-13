package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class ConfirmationFragment : NavigationContract.NavigationFragment() , ConfirmationContract.View {

    override var fragmentName: String = "fragment-confirmation"
    override val layoutId: Int = R.layout.fragment_confirmation

    @Inject
    lateinit var presenter : ConfirmationContract.Presenter

    override fun onConfirmSuccess() {

    }

    override fun showError(message: String) {

    }

    override fun isFormValid(): Boolean = false

    override fun getFirstPassword(): String = ""

    override fun getSecondPassword(): String = ""

}