package uk.co.bbc.sampleapp.listoflists

class VerticalItemsDataProvider (val horizontalItemsDataProvider: HorizontalItemsDataProvider) {
    fun getItems(totalItems: Int): List<VerticalItemUIModel> {
        val verticalItems = mutableListOf<VerticalItemUIModel>()

        for (i in 1 .. totalItems) {
            verticalItems.add(VerticalItemUIModel("vertical item $i", horizontalItemsDataProvider.getItems(totalItems)))
        }
        return verticalItems
    }

}