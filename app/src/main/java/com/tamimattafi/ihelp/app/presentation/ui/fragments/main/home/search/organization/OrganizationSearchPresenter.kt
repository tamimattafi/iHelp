package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationSearchScope
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization.OrganizationSearchContract
import javax.inject.Inject

@OrganizationSearchScope
class OrganizationSearchPresenter @Inject constructor(view : OrganizationSearchContract.View) : BasePresenter<OrganizationSearchContract.View>(view) , OrganizationSearchContract.Presenter {
}