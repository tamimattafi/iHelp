package com.tamimattafi.ihelp.app.presentation.ui.custom.welcome

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.tamimattafi.ihelp.R
import kotlinx.android.synthetic.main.holder_welcome_item.view.*


class ViewPagerAdapter(private val context: Context, private val myObjects: ArrayList<WelcomeItemData>) : PagerAdapter() {
    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val layout = LayoutInflater.from(context).inflate(R.layout.holder_welcome_item, collection, false)
        layout.apply {
            with(myObjects[position]) {
                welcome_item_title.text = label
                welcome_item_description.text = description
                welcome_item_image.setImageDrawable(drawable)
            }
        }
        collection.addView(layout)
        return layout
    }

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView(view as View)
    }

    override fun getCount(): Int {
        return this.myObjects.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
}
