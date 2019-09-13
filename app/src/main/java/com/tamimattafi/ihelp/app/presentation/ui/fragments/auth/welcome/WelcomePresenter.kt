package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.welcome

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

class WelcomePresenter @Inject constructor(view: WelcomeContract.View) : BasePresenter<WelcomeContract.View>(view),
    WelcomeContract.Presenter
