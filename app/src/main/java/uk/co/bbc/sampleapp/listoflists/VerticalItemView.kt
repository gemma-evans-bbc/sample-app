package uk.co.bbc.sampleapp.listoflists

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.vertical_item_view.view.*
import uk.co.bbc.sampleapp.R


class VerticalItemView@JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val horizontalItems = mutableListOf<HorizontalItemUIModel>()
    private val adapter = HorizontalListAdapter(horizontalItems)

    init {
        LayoutInflater.from(context).inflate(R.layout.vertical_item_view, this)
        horizontal_list.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        horizontal_list.adapter = adapter
    }

    fun render(verticalItemUIModel: VerticalItemUIModel) {
        title.text = verticalItemUIModel.title
        horizontalItems.clear()
        horizontalItems.addAll(verticalItemUIModel.horizontalItems)
        adapter.notifyDataSetChanged()
    }
}