package uk.co.bbc.sampleapp.listoflists

import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView

class VerticalListAdapter(private val verticalItems:List<VerticalItemUIModel>) : RecyclerView.Adapter<VerticalListAdapter.VerticalItemViewHolder>() {

    class VerticalItemViewHolder(val verticalItemView: VerticalItemView) : RecyclerView.ViewHolder(verticalItemView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): VerticalListAdapter.VerticalItemViewHolder {
        return VerticalItemViewHolder(VerticalItemView(parent.context))
    }

    override fun onBindViewHolder(holder: VerticalItemViewHolder, position: Int) {
        ViewCompat.setAccessibilityDelegate(holder.verticalItemView, HeadingAccessibilityDelegate(position))
        holder.verticalItemView.render(verticalItems[position])
    }

    override fun getItemCount() = verticalItems.size



}
