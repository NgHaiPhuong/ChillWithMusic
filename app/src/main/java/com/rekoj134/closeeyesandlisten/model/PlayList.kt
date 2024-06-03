package com.rekoj134.closeeyesandlisten.model

data class PlayList(
    val id: Int,
    val playListName: String,
    val items: List<MusicItem>? = null
)