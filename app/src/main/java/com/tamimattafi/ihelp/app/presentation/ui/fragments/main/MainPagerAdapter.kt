package com.tamimattafi.ihelp.app.presentation.ui.fragments.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import javax.inject.Inject

class MainPagerAdapter @Inject constructor(fragmentManager: FragmentManager)
    : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    @Inject
    lateinit var manager: MainContract.Manager

    override fun getItem(position: Int): Fragment {
        return manager.getFragments()[position]
    }

    override fun getCount(): Int {
        return manager.getFragments().size
    }
}