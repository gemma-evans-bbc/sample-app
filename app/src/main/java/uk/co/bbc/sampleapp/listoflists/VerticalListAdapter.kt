package uk.co.bbc.sampleapp.listoflists

import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView

class VerticalListAdapter(private val verticalItems: List<VerticalItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class HeadingViewHolder(val headingView: HeadingView) : RecyclerView.ViewHolder(headingView)
    class HorizontalListViewHolder(val horizontalListView: HorizontalListView) :
        RecyclerView.ViewHolder(horizontalListView)

    override fun getItemViewType(position: Int): Int {
        val type = verticalItems[position].type
        return type.ordinal
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return when (viewType) {
            0 -> HeadingViewHolder(HeadingView(parent.context))
            else -> HorizontalListViewHolder(HorizontalListView(parent.context))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is HeadingViewHolder -> {
                holder.headingView.render(verticalItems[position] as HeadingItemUIModel)
                ViewCompat.setAccessibilityDelegate(
                    holder.headingView,
                    HeadingAccessibilityDelegate(position)
                )
            }
            is HorizontalListViewHolder -> holder.horizontalListView.render(verticalItems[position] as HorizontalList)
        }

    }

    override fun getItemCount() = verticalItems.size


}
