package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data class Mediom (
    @SerializedName("url") var url : String,
    @SerializedName("width") var width : Int,
    @SerializedName("height") var height : Int
        )