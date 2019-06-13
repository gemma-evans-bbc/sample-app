package uk.co.bbc.sampleapp.homeview

data class VerticalItemUIModel(val title: String, val horizontalItems: List<HorizontalItemUIModel>)
data class HorizontalItemUIModel(val title: String)