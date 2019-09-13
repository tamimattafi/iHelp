package com.tamimattafi.ihelp.app.di.modules.fragments.main

import com.tamimattafi.ihelp.app.di.modules.fragments.main.home.OrganizationHomeModule
import com.tamimattafi.ihelp.app.di.modules.fragments.main.home.VolunteerHomeModule
import com.tamimattafi.ihelp.app.di.modules.fragments.main.profile.OrganizationProfileModule
import com.tamimattafi.ihelp.app.di.modules.fragments.main.profile.VolunteerProfileModule
import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.MainFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization.OrganizationHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer.VolunteerHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.menu.MenuFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.organization.OrganizationProfileFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer.VolunteerProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentsModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainFragment() : MainFragment

    @OrganizationHomeScope
    @ContributesAndroidInjector(modules = [OrganizationHomeModule::class])
    abstract fun organizationHomeFragment() : OrganizationHomeFragment

    @VolunteerHomeScope
    @ContributesAndroidInjector(modules = [VolunteerHomeModule::class])
    abstract fun volunteerHomeFragment() : VolunteerHomeFragment

    @ContributesAndroidInjector(modules = [OrganizationProfileModule::class])
    abstract fun organizationProfileFragment() : OrganizationProfileFragment


    @ContributesAndroidInjector(modules = [VolunteerProfileModule::class])
    abstract fun volunteerProfileFragment() : VolunteerProfileFragment

    @ContributesAndroidInjector(modules = [MenuModule::class])
    abstract fun menuFragment() : MenuFragment
}