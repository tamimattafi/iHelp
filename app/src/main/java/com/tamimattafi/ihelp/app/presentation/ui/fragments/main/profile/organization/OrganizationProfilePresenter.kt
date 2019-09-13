package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

class OrganizationProfilePresenter @Inject constructor(view : OrganizationProfileContract.View) : BasePresenter<OrganizationProfileContract.View>(view) ,
    OrganizationProfileContract.Presenter {
}