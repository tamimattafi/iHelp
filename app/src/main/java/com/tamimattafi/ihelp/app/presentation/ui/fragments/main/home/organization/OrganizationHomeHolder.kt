package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import android.view.View
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpSimpleHolder
import kotlinx.android.synthetic.main.item_view_holder_vacancy.view.*

class OrganizationHomeHolder(itemView : View): MvpSimpleHolder(itemView) , OrganizationHomeContract.Holder {

    override var objectId: Int? = null

    override fun setName(name: String) {
        itemView.name.text = name
    }

    override fun setDescription(description: String) {
        itemView.description.text = description
    }

    override fun setProfession(profession: String) {
        itemView.profession.hint = profession
    }

    override fun setOrganization(organization: String) {
        itemView.organization.hint = organization
    }

    override fun setDate(date: String) {
        itemView.date.text = date
    }
}