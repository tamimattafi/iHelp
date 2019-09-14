package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import com.tamimattafi.ihelp.app.di.scopes.main.volunteer.VolunteerHomeScope
import javax.inject.Inject

@VolunteerHomeScope
class VolunteerHomeAdapter @Inject constructor(
    presenter: VolunteerHomeContract.Presenter,
    listener : VolunteerHomeContract.View) : VolunteerHomeContract.Adapter(presenter, listener) {

    override fun getItemHolder(parent: ViewGroup): RecyclerView.ViewHolder
        = VolunteerHomeHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_view_holder_vacancy,
                parent,
                false
            )
        )

}