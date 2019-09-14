package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration

import com.tamimattafi.ihelp.app.presentation.mvp.presenter.BasePresenter
import com.tamimattafi.ihelp.model.auth.RegistrationCredentials
import com.tamimattafi.ihelp.repository.auth.global.AuthContract
import javax.inject.Inject

class RegistrationPresenter @Inject constructor(view: RegistrationContract.View) : BasePresenter<RegistrationContract.View>(view),
    RegistrationContract.Presenter {


    @Inject
    lateinit var repository: AuthContract.BaseAuthRepository<RegistrationCredentials>


    override fun onRegisterBtnPressed() {
        with(view) {
            if (isFormValid()) {
                setLoading()
                repository.authenticate(
                    RegistrationCredentials(
                        getUsername(),
                        getEmail(),
                        getPassword(),
                        getType()
                    )
                ).setOnSuccessListener {
                    onRegisterSuccess()
                }.setOnFailureListener {
                    showError(it)
                }
            }
        }
    }
}
