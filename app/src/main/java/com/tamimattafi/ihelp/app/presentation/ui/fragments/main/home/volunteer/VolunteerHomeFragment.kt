package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.volunteer

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.volunteer.VolunteerSearchFragment

class VolunteerHomeFragment : BaseHomeFragment<VolunteerHomeContract.Holder, VolunteerHomeContract.Presenter, VolunteerHomeContract.Adapter>(), VolunteerHomeContract.View {

    override fun getTitle(): String = appContext.getString(R.string.volunteers)
    override var fragmentName: String = "fragment-home-volunteers"

    override fun getSearchFragment(): NavigationContract.NavigationFragment
            = VolunteerSearchFragment()


    override fun onHolderClick(listPosition: Int, adapterPosition: Int, itemId: Int?) {

    }

    override fun onHolderLongClick(listPosition: Int, adapterPosition: Int, itemId: Int?) {

    }



}