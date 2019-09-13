package com.tamimattafi.ihelp.app.di.modules.fragments.main.profile

import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfileContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfileFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfilePresenter
import dagger.Binds
import dagger.Module

@Module
abstract class OrganizationProfileModule {

    @Binds
    abstract fun bindView(organizationProfileFragment: OrganizationProfileFragment) : OrganizationProfileContract.View

    @Binds
    abstract fun bindPresenter(organizationProfilePresenter: OrganizationProfilePresenter) : OrganizationProfileContract.Presenter
}