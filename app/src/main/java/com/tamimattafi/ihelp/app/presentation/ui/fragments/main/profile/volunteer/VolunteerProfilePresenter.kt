package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.profile.volunteer

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

class VolunteerProfilePresenter @Inject constructor(view : VolunteerProfileContract.View) : BasePresenter<VolunteerProfileContract.View>(view) ,
    VolunteerProfileContract.Presenter
