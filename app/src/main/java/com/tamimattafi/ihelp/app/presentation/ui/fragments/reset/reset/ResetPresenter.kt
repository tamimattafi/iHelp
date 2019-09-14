package com.tamimattafi.ihelp.app.presentation.ui.fragments.reset.reset

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import com.tamimattafi.ihelp.model.auth.ResetCredentials
import com.tamimattafi.ihelp.repository.reset.global.ResetRepositoryContract
import javax.inject.Inject

class ResetPresenter @Inject constructor(view : ResetContract.View) : BasePresenter<ResetContract.View>(view), ResetContract.Presenter {

    @Inject
    lateinit var repository : ResetRepositoryContract.BaseResetRepository<ResetCredentials>

    override fun onVerifyBtnPressed() {
        with(view) {
            if (isEmailValid()) {
                showLoading()
                repository.reset(
                    ResetCredentials(
                        getEmail()
                    )
                ).setOnSuccessListener {
                    onEmailSent()
                }.setOnFailureListener {
                    showError(it)
                }
            }
        }
    }
}
