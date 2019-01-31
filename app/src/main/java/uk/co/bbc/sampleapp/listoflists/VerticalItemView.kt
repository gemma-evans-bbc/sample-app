package uk.co.bbc.sampleapp.listoflists

import android.content.Context
import androidx.core.view.ViewCompat
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.vertical_item_view.*
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
        isFocusableInTouchMode = true
    }

    fun render(verticalItemUIModel: VerticalItemUIModel) {
        title.text = verticalItemUIModel.title
        horizontalItems.clear()
        horizontalItems.addAll(verticalItemUIModel.horizontalItems)
        adapter.notifyDataSetChanged()
    }
}