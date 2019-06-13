package uk.co.bbc.sampleapp.homeview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.vertical_item_view.view.*


class HorizontalItemView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.horizontal_item_view, this)
    }

    fun render(horizontalItemUIModel: HorizontalItemUIModel) {
        title.text = horizontalItemUIModel.title
    }
}