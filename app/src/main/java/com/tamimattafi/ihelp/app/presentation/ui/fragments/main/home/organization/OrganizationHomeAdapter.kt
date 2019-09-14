package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.di.scopes.main.organization.OrganizationHomeScope
import javax.inject.Inject

@OrganizationHomeScope
class OrganizationHomeAdapter @Inject constructor(
    presenter: OrganizationHomeContract.Presenter,
    listener : OrganizationHomeContract.View) : OrganizationHomeContract.Adapter(presenter, listener) {

    override fun getItemHolder(parent: ViewGroup): RecyclerView.ViewHolder
        = OrganizationHomeHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_view_holder_vacancy,
                parent,
                false
            )
        )

}