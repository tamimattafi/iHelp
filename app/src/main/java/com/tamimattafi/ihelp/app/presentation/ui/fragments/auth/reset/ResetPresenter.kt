package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.reset

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

class ResetPresenter @Inject constructor(view : ResetContract.View) : BasePresenter<ResetContract.View>(view) , ResetContract.Presenter
