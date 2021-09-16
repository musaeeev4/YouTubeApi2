package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("kind") var kind: String,
    @SerializedName("etag") var stag: String,
    @SerializedName(" id") var id: String,
    @SerializedName("snippet") var snippet: Snipet,
)