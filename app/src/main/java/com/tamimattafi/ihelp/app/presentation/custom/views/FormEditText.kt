package com.tamimattafi.ihelp.app.presentation.custom.views

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import com.tamimattafi.ihelp.R
import com.tamimattafi.ihelp.utils.AppUtils

class FormEditText(context: Context, attributeSet: AttributeSet) : AppCompatEditText(context, attributeSet) {
    override fun getBackground(): Drawable =
        AppUtils.getDrawable(context, R.drawable.background_edit_text_field) ?: super.getBackground()
}