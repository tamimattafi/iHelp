package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration

import com.tamimattafi.ihelp.app.di.scopes.RegistrationScope
import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

@RegistrationScope
class RegistrationPresenter @Inject constructor(view: RegistrationContract.View) : BasePresenter<RegistrationContract.View>(view),
    RegistrationContract.Presenter
