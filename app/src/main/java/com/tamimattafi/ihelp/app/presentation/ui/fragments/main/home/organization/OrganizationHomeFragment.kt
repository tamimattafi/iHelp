package com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.organization

import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.global.BaseHomeFragment
import com.tamimattafi.ihelp.app.presentation.ui.fragments.main.home.search.organization.OrganizationSearchFragment

class OrganizationHomeFragment : BaseHomeFragment<OrganizationHomeContract.Holder, OrganizationHomeContract.Presenter, OrganizationHomeContract.Adapter>(), OrganizationHomeContract.View {

    override fun getTitle(): String = appContext.getString(R.string.vacancies)
    override var fragmentName: String = "fragment-home-organization"

    override fun getSearchFragment(): NavigationContract.NavigationFragment
            = OrganizationSearchFragment()


    override fun onHolderClick(listPosition: Int, adapterPosition: Int, itemId: Int?) {

    }

    override fun onHolderLongClick(listPosition: Int, adapterPosition: Int, itemId: Int?) {

    }

}