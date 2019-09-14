package com.tamimattafi.ihelp.app.di.modules.fragments.main.home

import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeAdapter
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomePresenter
import com.tamimattafi.ihelp.model.list.Volunteer
import com.tamimattafi.ihelp.repository.list.VolunteerRepository
import com.tamimattafi.ihelp.repository.list.global.RepositoryContract
import dagger.Binds
import dagger.Module

@Module
abstract class VolunteerHomeModule {

    @VolunteerHomeScope @Binds
    abstract fun bindView(volunteerHomeFragment: VolunteerHomeFragment) : VolunteerHomeContract.View

    @VolunteerHomeScope @Binds
    abstract fun bindPresenter(volunteerHomePresenter: VolunteerHomePresenter) : VolunteerHomeContract.Presenter

    @VolunteerHomeScope @Binds
    abstract fun bindAdapter(volunteerHomeAdapter: VolunteerHomeAdapter) : VolunteerHomeContract.Adapter

    @VolunteerHomeScope @Binds
    abstract fun bindRepository(volunteerRepository: VolunteerRepository) : RepositoryContract.RepositoryBase<Volunteer>

}