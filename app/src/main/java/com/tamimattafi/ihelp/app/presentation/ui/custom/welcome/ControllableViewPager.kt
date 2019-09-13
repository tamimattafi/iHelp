package com.tamimattafi.ihelp.app.presentation.ui.custom.welcome

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.utils.AppUtils

class ControllableViewPager(context: Context, attributes: AttributeSet) : ViewPager(context, attributes) {

    private var finishListener: FinishListener? = null

    fun setUpControllers(
        next : ImageButton,
        back : ImageButton,
        page : TextView
    ) {
        next.setOnClickListener {
            moveForward()
        }

        back.setOnClickListener {
            moveBackward()
        }

        page.text = getPageCount()

        SimplePageChangeListener.attachViewPager(this,
            object : SimplePageChangeListener.PagerScreenListener{
                override fun onPageSelected(position: Int) {
                    page.text = getPageCount()
                    next.setImageDrawable(
                        if (position + 1 == adapter?.count) {
                            next.setOnClickListener {
                                finishListener?.onFinish()
                            }
                            AppUtils.getDrawable(context, R.drawable.ic_check)
                        } else {
                            next.setOnClickListener {
                                moveForward()
                            }
                            AppUtils.getDrawable(context, R.drawable.ic_forward)
                        }
                    )
                    back.visibility = if (position == 0) View.INVISIBLE else View.VISIBLE
                }
            }
        )
    }

    private fun getPageCount() : String {
        return "${currentItem + 1}/${adapter?.count}"
    }

    private fun moveForward() {
        arrowScroll(View.FOCUS_RIGHT)
    }

    private fun moveBackward() {
        arrowScroll(View.FOCUS_LEFT)
    }

    fun setPageFinishListener(finishListener : FinishListener) {
        this.finishListener = finishListener
    }

    interface FinishListener {
        fun onFinish()
    }
}