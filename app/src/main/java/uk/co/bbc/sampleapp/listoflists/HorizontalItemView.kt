package uk.co.bbc.sampleapp.listoflists

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.vertical_item_view.view.*
import uk.co.bbc.sampleapp.R


class HorizontalItemView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.horizontal_item_view, this)
    }

    fun render(horizontalItemUIModel: HorizontalItemUIModel) {
        title.text = horizontalItemUIModel.title
    }
}