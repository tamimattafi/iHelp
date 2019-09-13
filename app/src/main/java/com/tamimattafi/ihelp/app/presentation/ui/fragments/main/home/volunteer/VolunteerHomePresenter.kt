package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

@VolunteerHomeScope
class VolunteerHomePresenter @Inject constructor(view : VolunteerHomeContract.View) : BasePresenter<VolunteerHomeContract.View>(view) ,
    VolunteerHomeContract.Presenter
