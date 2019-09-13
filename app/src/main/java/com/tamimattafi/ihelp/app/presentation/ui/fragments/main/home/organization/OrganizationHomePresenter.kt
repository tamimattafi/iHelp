package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

@OrganizationHomeScope
class OrganizationHomePresenter @Inject constructor(view : OrganizationHomeContract.View) : BasePresenter<OrganizationHomeContract.View>(view) , OrganizationHomeContract.Presenter {
}