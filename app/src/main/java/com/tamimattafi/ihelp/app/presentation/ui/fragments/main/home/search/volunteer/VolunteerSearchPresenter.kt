package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.volunteer

import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerSearchScope
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

@VolunteerSearchScope
class VolunteerSearchPresenter @Inject constructor(view : VolunteerSearchContract.View) : BasePresenter<VolunteerSearchContract.View>(view) ,
    VolunteerSearchContract.Presenter
