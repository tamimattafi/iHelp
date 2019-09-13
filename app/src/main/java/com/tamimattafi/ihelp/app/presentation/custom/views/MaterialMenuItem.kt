package com.tamimattafi.ihelp.app.presentation.custom.views

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.util.Linkify
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.widget.CompoundButton
import android.widget.FrameLayout
import com.tamimattafi.ihelp.R
import kotlinx.android.synthetic.main.info_item_view_icon.view.*
import kotlinx.android.synthetic.main.info_item_view_switch.view.*
import kotlinx.android.synthetic.main.info_item_view_text.view.*
import kotlinx.android.synthetic.main.info_item_view_text.view.info_item_label


class MaterialMenuItem(context: Context, attributeSet: AttributeSet) : FrameLayout(context, attributeSet) {

    companion object {
        const val TYPE_ICON = 0
        const val TYPE_SWITCH = 1
        const val TYPE_TEXT = 2
        const val TYPE_TEXT_ICON = 3
    }

    var hintAutoLinks: Boolean = false
        set(value) {
            field = value
            try {
                info_item_hint.autoLinkMask = if (value) Linkify.ALL else 0
            } catch (e: Exception) {
            }
        }

    var hintSelectable: Boolean = false
        set(value) {
            field = value
            try {
                info_item_hint.setTextIsSelectable(value)
            } catch (e: Exception) {
            }
        }

    var label: String? = ""
        set(value) {
            field = value
            info_item_label.text = value
        }

    var hint: String? = ""
        set(value) {
            field = value
            try {
                info_item_hint.text = value
            } catch (e: Exception) {
            }
        }

    var isChecked: Boolean = false
        set(value) {
            field = value
            try {
                info_item_switch.isChecked = value
            } catch (e: Exception) {
            }
        }
        get() {
            return try {
                info_item_switch.isChecked
            } catch (e: Exception) {
                field
            }
        }

    var hintGravity: Int = 0
        set(value) {
            field = value
            try {
                info_item_hint.gravity = value
            } catch (e: Exception) {
            }
        }

    var drawable: Drawable? = null
        set(value) {
            field = value
            try {
                info_item_icon.setImageDrawable(value)
            } catch (e: Exception) {
            }
        }

    var iconSize : Int? = 24
        set(value) {
            field = value
            try {
                info_item_icon.layoutParams.width = value!!
                info_item_icon.layoutParams.height = value
            } catch (e: Exception) {}
        }

    init {
        with(context.obtainStyledAttributes(attributeSet, R.styleable.MaterialMenuItem)) {
            setType(
                getInt(
                    R.styleable.MaterialMenuItem_infoType,
                    TYPE_TEXT
                )
            )
            label = getString(R.styleable.MaterialMenuItem_label)
            hint = getString(R.styleable.MaterialMenuItem_hint)
            isChecked = getBoolean(R.styleable.MaterialMenuItem_setChecked, false)
            hintGravity = getInt(R.styleable.MaterialMenuItem_hintGravity, Gravity.START)
            hintSelectable = getBoolean(R.styleable.MaterialMenuItem_hintSelectable, false)
            hintAutoLinks = getBoolean(R.styleable.MaterialMenuItem_autoLinksAll, false)
            drawable = getDrawable(R.styleable.MaterialMenuItem_drawable)

            setClickableBehaviour(getBoolean(R.styleable.MaterialMenuItem_setClickable, false))
            recycle()
        }
    }

    private fun setType(int: Int) {
        inflate(context,
            when (int) {
                TYPE_TEXT -> {
                    R.layout.info_item_view_text
                }
                TYPE_ICON -> {
                    R.layout.info_item_view_icon
                }
                TYPE_TEXT_ICON -> {
                    R.layout.info_item_view_text_icon
                }
                else -> {
                    setOnClickListener {
                        isChecked = !isChecked
                    }
                    R.layout.info_item_view_switch
                }
            }, this)
    }

    private fun setClickableBehaviour(clickable: Boolean) {
        isClickable = clickable
        isFocusable = clickable
        if (clickable) {
            TypedValue().apply {
                context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
                setBackgroundResource(resourceId)
            }
        }
    }

    fun setOnCheckedChangeListener(checkListener: CompoundButton.OnCheckedChangeListener) {
        try {
            info_item_switch.setOnCheckedChangeListener(checkListener)
        } catch (e: Exception) {
        }
    }
}