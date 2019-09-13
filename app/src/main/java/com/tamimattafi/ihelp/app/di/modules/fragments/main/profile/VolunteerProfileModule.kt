package com.tamimattafi.ihelp.app.di.modules.fragments.main.profile

import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer.VolunteerProfileContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer.VolunteerProfileFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer.VolunteerProfilePresenter
import dagger.Binds
import dagger.Module

@Module
abstract class VolunteerProfileModule {

    @Binds
    abstract fun bindView(volunteerProfileFragment: VolunteerProfileFragment) : VolunteerProfileContract.View

    @Binds
    abstract fun bindPresenter(volunteerProfilePresenter: VolunteerProfilePresenter) : VolunteerProfileContract.Presenter
}