package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import javax.inject.Inject

class ResetFragment : NavigationContract.NavigationFragment() , ResetContract.View {

    override var fragmentName: String = "fragment-reset"
    override val layoutId: Int = R.layout.fragment_reset

    @Inject
    lateinit var presenter : ResetContract.Presenter

}