package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data  class Standard(
    @SerializedName("url") var url : String,
    @SerializedName("width") var width : Int,
    @SerializedName("height") var height : Int
)
