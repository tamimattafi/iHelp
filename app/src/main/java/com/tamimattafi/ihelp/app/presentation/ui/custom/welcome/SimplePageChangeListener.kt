package com.tamimattafi.ihelp.app.presentation.ui.custom.welcome

import androidx.viewpager.widget.ViewPager

object SimplePageChangeListener {

    fun attachViewPager(viewPager: ViewPager, listener: PagerScreenListener) {
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                listener.onPageSelected(position)
            }

        })
    }

    interface PagerScreenListener {
        fun onPageSelected(position: Int)
    }

}
