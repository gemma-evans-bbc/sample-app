package uk.co.bbc.sampleapp.homeview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalListAdapter(private val horizontalItems:List<HorizontalItemUIModel>) : RecyclerView.Adapter<HorizontalListAdapter.HorizontalItemViewHolder>() {

    class HorizontalItemViewHolder(val horizontalItemView: HorizontalItemView) : RecyclerView.ViewHolder(horizontalItemView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): HorizontalItemViewHolder {
        return HorizontalItemViewHolder(HorizontalItemView(parent.context))
    }

    override fun onBindViewHolder(holder: HorizontalItemViewHolder, position: Int) {
        holder.horizontalItemView.render(horizontalItems[position])
    }

    override fun getItemCount() = horizontalItems.size



}
