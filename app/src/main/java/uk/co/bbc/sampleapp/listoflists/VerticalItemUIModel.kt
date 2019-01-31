package uk.co.bbc.sampleapp.listoflists

data class VerticalItemUIModel(val title: String, val horizontalItems: List<HorizontalItemUIModel>)
data class HorizontalItemUIModel(val title: String)