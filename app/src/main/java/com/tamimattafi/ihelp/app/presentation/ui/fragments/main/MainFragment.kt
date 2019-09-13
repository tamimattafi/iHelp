package com.tamimattafi.ihelp.app.presentation.ui.fragments.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.app.presentation.navigation.NavigationContract
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

class MainFragment : NavigationContract.NavigationFragment() {
    override var fragmentName: String = "fragment-main"
    override val layoutId: Int = R.layout.fragment_main

    @Inject
    lateinit var pagerAdapter: MainPagerAdapter

    private lateinit var fragments : ArrayList<Fragment>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpFragments()

    }

    private fun setUpFragments() {


    }


}