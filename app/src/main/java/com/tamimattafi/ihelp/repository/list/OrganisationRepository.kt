package com.tamimattafi.ihelp.repository.list

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.model.list.ListPage
import com.tamimattafi.ihelp.model.list.Vacancy
import com.tamimattafi.ihelp.repository.list.global.RepositoryContract
import retrofit2.Call
import javax.inject.Inject

@OrganizationHomeScope
class OrganisationRepository @Inject constructor() : RepositoryContract.RepositoryBase<Vacancy>() {

    override fun getListCall(): Call<ListPage<Vacancy>>
            = interractor.getVacancies()

}