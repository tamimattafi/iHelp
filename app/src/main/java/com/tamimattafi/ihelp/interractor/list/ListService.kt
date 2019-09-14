package com.tamimattafi.ihelp.interractor.list

import com.tamimattafi.ihelp.interractor.ApiPaths
import com.tamimattafi.ihelp.model.list.ListPage
import com.tamimattafi.ihelp.model.list.Vacancy
import com.tamimattafi.ihelp.model.list.Volunteer
import retrofit2.Call
import retrofit2.http.GET

interface ListService {

    @GET(ApiPaths.VACANCIES)
    fun getVacancies() : Call<ListPage<Vacancy>>

    @GET
    fun getVolunteers() : Call<ListPage<Volunteer>>
}