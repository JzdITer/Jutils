package com.jzd.android.jutils.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.jzd.android.jutils.R

/**
 * Created by Jzd on 2018/7/16.
 * 表单列表项
 * // TODO v21构造方法LinearLayout(context, attrs, defStyleAttr，defStyleRes)
 */
class JFormItemView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : LinearLayout(context, attrs, defStyleAttr)
{
    //constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : this(context, attrs, defStyleAttr, 0)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context?) : this(context, null)

    lateinit var mLayoutRoot: LinearLayout
    lateinit var mLayoutContent: LinearLayout
    lateinit var mTvItemLeft: TextView
    lateinit var mTvItemContext: TextView
    lateinit var mTvItemRight: TextView
    lateinit var mDivider: View

    init
    {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_j_form_item_view, this, true)
        if (context != null && attrs != null)
        {
            val attributeSet = context.obtainStyledAttributes(attrs, R.styleable.JFormItemView)

            // 左侧TextView
            mTvItemLeft = view.findViewById(R.id.mTvItemLeft)
            val leftIcon = attributeSet.getResourceId(R.styleable.JFormItemView_left_icon, 0)
            mTvItemLeft.setCompoundDrawablesWithIntrinsicBounds(leftIcon, 0, 0, 0)
            val leftTextSize = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_left_text_size, 15)
            mTvItemLeft.setTextSize(TypedValue.COMPLEX_UNIT_PX, leftTextSize.toFloat())
            val leftTextColor = attributeSet.getColor(R.styleable.JFormItemView_left_text_color, Color.BLACK)
            mTvItemLeft.setTextColor(leftTextColor)
            val leftIconPadding = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_left_icon_padding, 0)
            mTvItemLeft.compoundDrawablePadding = leftIconPadding
            val leftPaddingStart = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_left_padding_start, 0)
            val leftPaddingTop = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_left_padding_top, 0)
            val leftPaddingEnd = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_left_padding_end, 0)
            val leftPaddingBottom = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_left_padding_bottom, 0)
            mTvItemLeft.setPadding(leftPaddingStart, leftPaddingTop, leftPaddingEnd, leftPaddingBottom)
            val leftText = attributeSet.getString(R.styleable.JFormItemView_left_text)
            mTvItemLeft.text = leftText

            // 中间TextView
            mTvItemContext = view.findViewById(R.id.mTvItemContext)
            val contentTextSize = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_content_text_size, 15)
            mTvItemContext.setTextSize(TypedValue.COMPLEX_UNIT_PX, contentTextSize.toFloat())
            val contentTextColor = attributeSet.getColor(R.styleable.JFormItemView_content_text_color, Color.BLACK)
            mTvItemContext.setTextColor(contentTextColor)
            val contentPaddingStart = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_content_padding_start, 0)
            val contentPaddingTop = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_content_padding_top, 0)
            val contentPaddingEnd = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_content_padding_end, 0)
            val contentPaddingBottom = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_content_padding_bottom, 0)
            mTvItemContext.setPadding(contentPaddingStart, contentPaddingTop, contentPaddingEnd, contentPaddingBottom)
            val contentText = attributeSet.getString(R.styleable.JFormItemView_content_text)
            mTvItemContext.text = contentText
            val contentHint = attributeSet.getString(R.styleable.JFormItemView_content_hint)
            mTvItemContext.hint = contentHint
            val contentTextColorHint = attributeSet.getColor(R.styleable.JFormItemView_content_text_color_hint, Color.BLACK)
            mTvItemContext.setHintTextColor(contentTextColorHint)

            // 右侧TextView
            mTvItemRight = view.findViewById(R.id.mTvItemRight)
            val rightIcon = attributeSet.getResourceId(R.styleable.JFormItemView_right_icon, 0)
            mTvItemRight.setCompoundDrawablesWithIntrinsicBounds(0, 0, rightIcon, 0)
            val rightPaddingStart = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_right_padding_start, 0)
            val rightPaddingTop = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_right_padding_top, 0)
            val rightPaddingEnd = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_right_padding_end, 0)
            val rightPaddingBottom = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_right_padding_bottom, 0)
            mTvItemRight.setPadding(rightPaddingStart, rightPaddingTop, rightPaddingEnd, rightPaddingBottom)
            val rightVisible = attributeSet.getBoolean(R.styleable.JFormItemView_right_visible, false)
            if (rightVisible)
            {
                mTvItemRight.visibility = View.VISIBLE
            }
            else
            {
                mTvItemRight.visibility = View.GONE
            }
            val rightTextSize = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_right_text_size, 15)
            mTvItemRight.setTextSize(TypedValue.COMPLEX_UNIT_PX, rightTextSize.toFloat())
            val rightTextColor = attributeSet.getColor(R.styleable.JFormItemView_right_text_color, Color.BLACK)
            mTvItemRight.setTextColor(rightTextColor)
            val rightIconPadding = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_right_icon_padding, 0)
            mTvItemRight.compoundDrawablePadding = rightIconPadding
            val rightText = attributeSet.getString(R.styleable.JFormItemView_right_text)
            mTvItemRight.text = rightText

            // 分割线
            mDivider = view.findViewById(R.id.mDivider)
            val dividerColor = attributeSet.getColor(R.styleable.JFormItemView_divider_color, Color.BLACK)
            mDivider.setBackgroundColor(dividerColor)
            val dividerPaddingStart = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_divider_padding_start, 0)
            val dividerPaddingTop = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_divider_padding_top, 0)
            val dividerPaddingEnd = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_divider_padding_end, 0)
            val dividerPaddingBottom = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_divider_padding_bottom, 0)
            val layoutParams = mDivider.layoutParams as LinearLayout.LayoutParams
            layoutParams.setMargins(dividerPaddingStart, dividerPaddingTop, dividerPaddingEnd, dividerPaddingBottom)
            val dividerHeight = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_divider_height, 1)
            mDivider.layoutParams.height = dividerHeight


            // 整体
            mLayoutRoot = view.findViewById(R.id.mLayoutRoot)
            val itemPadding = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_item_padding, 0)
            var itemPaddingStart = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_item_padding_start, 0)
            var itemPaddingTop = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_item_padding_top, 0)
            var itemPaddingEnd = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_item_padding_end, 0)
            var itemPaddingBottom = attributeSet.getDimensionPixelSize(R.styleable.JFormItemView_item_padding_bottom, 0)
            if (itemPadding != 0)
            {
                itemPaddingStart = itemPadding
                itemPaddingTop = itemPadding
                itemPaddingEnd = itemPadding
                itemPaddingBottom = itemPadding
            }
            mLayoutRoot.setPadding(itemPaddingStart, itemPaddingTop, itemPaddingEnd, itemPaddingBottom)


            // 回收资源
            attributeSet.recycle()
        }
    }



}
