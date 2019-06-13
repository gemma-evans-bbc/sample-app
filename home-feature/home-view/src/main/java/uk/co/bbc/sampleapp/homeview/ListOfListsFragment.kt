package uk.co.bbc.sampleapp.homeview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.list_of_lists_fragment.*

class ListOfListsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_of_lists_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val verticalItems = VerticalItemsDataProvider(HorizontalItemsDataProvider()).getItems(10)
        val adapter = VerticalListAdapter(verticalItems)

        vertical_list.layoutManager = LinearLayoutManager(context)
        vertical_list.adapter = adapter
    }

}

