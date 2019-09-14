package com.tamimattafi.ihelp.app.presentation.ui.fragments.auth.registration

import android.content.Context
import com.tamimattafi.ihelp.R

object RegistrationValues {
    private var TYPE_LIST : ArrayList<String>? = null

    fun getTypeList(context: Context) : ArrayList<String>
            = TYPE_LIST ?: ArrayList<String>().apply {
                add(context.resources.getString(R.string.volunteer))
                add(context.resources.getString(R.string.organization))
            }.also { TYPE_LIST = it }

    fun getType(context: Context, name: String) : Boolean
            = name != getTypeList(context)[0]
}