package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu

import android.os.Bundle
import android.view.View
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfileContract
import com.tamimattafi.ihelp.utils.AppUtils
import javax.inject.Inject

class MenuFragment : NavigationContract.NavigationFragment() ,
    MenuContract.View {

    override var fragmentName: String = "fragment-menu"
    override val layoutId: Int = R.layout.fragment_menu

    @Inject
    lateinit var presenter : MenuContract.Presenter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        AppUtils.showToast(appContext, "kjebfjkebfjke")
    }
}