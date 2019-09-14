package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import android.view.View
import com.squareup.picasso.Picasso
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.mvp.recycler.MvpSimpleHolder
import com.tamimattafi.ihelp.utils.AppUtils
import kotlinx.android.synthetic.main.item_view_holder_volunteer.view.*

class VolunteerHomeHolder(itemView : View): MvpSimpleHolder(itemView) , VolunteerHomeContract.Holder {

    override var objectId: Int? = null

    override fun setEmail(email: String) {
        itemView.email.text = email
    }

    override fun setActive(isActive: Boolean) {
        itemView.active.setColorFilter(
            AppUtils.getColor(itemView.context, if (isActive) R.color.colorActive else R.color.colorNotActive)
        )
    }

    override fun setPicture(picture: String) {
        Picasso.get()
            .load(picture)
            .placeholder(R.drawable.img_placeholder)
            .error(R.drawable.img_error)
            .into(itemView.image)
    }

    override fun setName(name: String) {
        itemView.name.text = name
    }

}