package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpRecyclerPresenter
import com.tamimattafi.ihelp.model.list.Vacancy
import com.tamimattafi.ihelp.model.list.Volunteer
import com.tamimattafi.ihelp.repository.list.global.RepositoryContract
import javax.inject.Inject

@VolunteerHomeScope
class VolunteerHomePresenter @Inject constructor(
    view : VolunteerHomeContract.View,
    repository : RepositoryContract.RepositoryBase<Volunteer>
) : MvpRecyclerPresenter<Volunteer, VolunteerHomeContract.View, VolunteerHomeContract.Holder>(view, repository) , VolunteerHomeContract.Presenter {

    override fun bindViewHolder(holder: VolunteerHomeContract.Holder) {
        with(dataList[holder.listPosition]) {
            with(holder) {
                setEmail(contacts.email)
                setName(name)
                setActive(active)
                setPicture(photo)
            }
        }
    }

}
