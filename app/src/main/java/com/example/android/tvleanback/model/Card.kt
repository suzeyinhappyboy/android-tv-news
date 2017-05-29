package com.example.android.tvleanback.model

/**
 * Created by Nick F on 5/28/2017.
 */

class Card {
    companion object {
        val TYPE_ARTICLE = 0
        val TYPE_VIDEO = 1
        val TYPE_PODCAST = 2
        val TYPE_APP_ABOUT = 3.1
        val TYPE_APP = 3
    }
    val type: Int = Card.TYPE_ARTICLE
    val imageUrl: String? = null
    val bgImageUrl: String? = null
    val primaryText: String = ""
    val secondaryText: String = ""
}
