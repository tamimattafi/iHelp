package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.confirmation

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class ConfirmationFragment : NavigationContract.NavigationFragment() , ConfirmationContract.View {

    override var fragmentName: String = "fragment-confirmation"
    override val layoutId: Int = R.layout.fragment_confirmation

    @Inject
    lateinit var presenter : ConfirmationContract.Presenter

}