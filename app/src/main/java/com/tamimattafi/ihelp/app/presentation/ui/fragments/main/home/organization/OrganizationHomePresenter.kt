package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerPresenter
import com.tamimattafi.ihelp.model.list.Vacancy
import com.tamimattafi.ihelp.repository.list.global.RepositoryContract
import javax.inject.Inject

@OrganizationHomeScope
class OrganizationHomePresenter @Inject constructor(
    view : OrganizationHomeContract.View,
    repository : RepositoryContract.RepositoryBase<Vacancy>
) : MvpRecyclerPresenter<Vacancy, OrganizationHomeContract.View, OrganizationHomeContract.Holder>(view, repository) , OrganizationHomeContract.Presenter {

    override fun bindViewHolder(holder: OrganizationHomeContract.Holder) {
        with(dataList[holder.listPosition]) {
            with(holder) {
                setDate(dateRange)
                setName(name)
                setDescription(description)
                setOrganization(organizationCategory)
                setProfession(professionType)
            }
        }
    }

}