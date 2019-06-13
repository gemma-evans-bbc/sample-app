package uk.co.bbc.sampleapp.listoflists

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.heading_view.view.*
import kotlinx.android.synthetic.main.horizontal_list_view.view.*
import uk.co.bbc.sampleapp.R


class HeadingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.heading_view, this)
    }

    fun render(headingItemUIModel: HeadingItemUIModel) {
        title.text = headingItemUIModel.title
    }
}