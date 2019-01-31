package uk.co.bbc.sampleapp.listoflists

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_of_lists_fragment.*
import uk.co.bbc.sampleapp.R

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

        val verticalItems = VerticalItemsDataProvider().getItems(10)
        val adapter = VerticalListAdapter(verticalItems)

        vertical_list.layoutManager = LinearLayoutManager(context)
        vertical_list.adapter = adapter
    }

}

