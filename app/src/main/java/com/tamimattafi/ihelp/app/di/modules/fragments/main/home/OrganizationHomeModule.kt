package com.tamimattafi.ihelp.app.di.modules.fragments.main.home

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeAdapter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomePresenter
import com.tamimattafi.ihelp.model.list.Vacancy
import com.tamimattafi.ihelp.repository.list.OrganisationRepository
import com.tamimattafi.ihelp.repository.list.global.RepositoryContract
import dagger.Binds
import dagger.Module

@Module
abstract class OrganizationHomeModule {

    @OrganizationHomeScope @Binds
    abstract fun bindView(organizationHomeFragment: OrganizationHomeFragment) : OrganizationHomeContract.View

    @OrganizationHomeScope @Binds
    abstract fun bindPresenter(organizationHomePresenter: OrganizationHomePresenter) : OrganizationHomeContract.Presenter

    @OrganizationHomeScope @Binds
    abstract fun bindAdapter(organizationHomeAdapter: OrganizationHomeAdapter) : OrganizationHomeContract.Adapter

    @OrganizationHomeScope @Binds
    abstract fun bindRepository(repository : OrganisationRepository) : RepositoryContract.RepositoryBase<Vacancy>
}