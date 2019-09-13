package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.confirmation

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import com.tamimattafi.ihelp.model.auth.ConfirmCredentials
import com.tamimattafi.ihelp.repository.reset.global.ResetRepositoryContract
import javax.inject.Inject

class ConfirmationPresenter @Inject constructor(view : ConfirmationContract.View) : BasePresenter<ConfirmationContract.View>(view) ,
    ConfirmationContract.Presenter {

    @Inject
    lateinit var repository: ResetRepositoryContract.BaseResetRepository<ConfirmCredentials>

    override fun onConfirmBtnClick() {
        with(view) {
            if (isFormValid()) {
                repository.reset(
                    ConfirmCredentials(
                        getFirstPassword(),
                        getSecondPassword()
                    )
                ).setOnSuccessListener {
                    onConfirmSuccess()
                }.setOnFailureListener {
                    showError(it)
                }
            }
        }
    }
}
