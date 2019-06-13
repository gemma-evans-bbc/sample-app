package uk.co.bbc.sampleapp.homeview

class HorizontalItemsDataProvider {
    fun getItems(totalItems: Int): List<HorizontalItemUIModel> {
        val horizontalItems = mutableListOf<HorizontalItemUIModel>()

        for (i in 1 .. totalItems) {
            horizontalItems.add(HorizontalItemUIModel("horizontal item $i"))
        }
        return horizontalItems
    }

}