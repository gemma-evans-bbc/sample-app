package uk.co.bbc.sampleapp.listoflists

class VerticalItemsDataProvider (private val horizontalItemsDataProvider: HorizontalItemsDataProvider) {

    fun getItems(totalItems: Int): List<VerticalItem> {
        val verticalItems = mutableListOf<VerticalItem>()

        for (i in 1 .. totalItems) {
            verticalItems.add(HeadingItemUIModel("vertical item $i"))
            verticalItems.add(HorizontalList(horizontalItemsDataProvider.getItems(totalItems)))
        }
        return verticalItems
    }

}