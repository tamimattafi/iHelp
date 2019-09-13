package com.tamimattafi.ihelp.app.di.modules.fragments.main.home

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomePresenter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomePresenter
import dagger.Binds
import dagger.Module

@Module
abstract class VolunteerHomeModule {

    @VolunteerHomeScope @Binds
    abstract fun bindView(volunteerHomeFragment: VolunteerHomeFragment) : VolunteerHomeContract.View

    @VolunteerHomeScope @Binds
    abstract fun bindPresenter(volunteerHomePresenter: VolunteerHomePresenter) : VolunteerHomeContract.Presenter
}