package com.tamimattafi.ihelp.repository.list

import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import com.tamimattafi.ihelp.model.list.ListPage
import com.tamimattafi.ihelp.model.list.Volunteer
import com.tamimattafi.ihelp.repository.list.global.RepositoryContract
import retrofit2.Call
import javax.inject.Inject

@VolunteerHomeScope
class VolunteerRepository @Inject constructor() : RepositoryContract.RepositoryBase<Volunteer>() {

    override fun getListCall(): Call<ListPage<Volunteer>>
            = interractor.getVolunteers()

}