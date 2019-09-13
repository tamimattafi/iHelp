package com.tamimattafi.ihelp.app.di.modules.fragments.main.home.search

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationSearchScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization.OrganizationSearchContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization.OrganizationSearchFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization.OrganizationSearchPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class OrganizationSearchModule {

    @OrganizationSearchScope @Binds
    abstract fun bindView(organizationSearchFragment: OrganizationSearchFragment) : OrganizationSearchContract.View

    @OrganizationSearchScope @Binds
    abstract fun bindPresenter(organizationSearchPresenter: OrganizationSearchPresenter) : OrganizationSearchContract.Presenter
}