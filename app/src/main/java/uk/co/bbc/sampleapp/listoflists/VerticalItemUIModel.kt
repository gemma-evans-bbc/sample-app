package uk.co.bbc.sampleapp.listoflists

data class HorizontalItemUIModel(val title: String)

sealed class VerticalItem(val type:ItemType)
data class HeadingItemUIModel(val title:String) : VerticalItem(ItemType.HEADING)
data class HorizontalList(val items : List<HorizontalItemUIModel>) : VerticalItem(ItemType.LIST)

enum class ItemType {
    HEADING,
    LIST
}
