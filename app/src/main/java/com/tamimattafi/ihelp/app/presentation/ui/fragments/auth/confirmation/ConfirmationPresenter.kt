package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.confirmation

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import javax.inject.Inject

class ConfirmationPresenter @Inject constructor(view : ConfirmationContract.View) : BasePresenter<ConfirmationContract.View>(view) ,
    ConfirmationContract.Presenter {

    override fun onOkBtnPressed() {
        with(view) {
            if (isPasswordsValid()) {
                setLoading()
            }
        }
    }
}
