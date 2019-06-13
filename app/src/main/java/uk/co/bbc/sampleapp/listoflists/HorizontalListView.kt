package uk.co.bbc.sampleapp.listoflists

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.horizontal_list_view.view.*
import uk.co.bbc.sampleapp.R


class HorizontalListView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val horizontalItems = mutableListOf<HorizontalItemUIModel>()
    private val adapter = HorizontalListAdapter(horizontalItems)

    init {
        LayoutInflater.from(context).inflate(R.layout.horizontal_list_view, this)
        horizontal_list.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        horizontal_list.adapter = adapter
        isFocusableInTouchMode = true
    }

    fun render(horizontalList: HorizontalList) {
        horizontalItems.clear()
        horizontalItems.addAll(horizontalList.items)
        adapter.notifyDataSetChanged()
    }
}