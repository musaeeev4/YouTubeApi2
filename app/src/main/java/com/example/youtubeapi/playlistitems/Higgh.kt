package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data class Higgh (


    @SerializedName("url") var url : String,
    @SerializedName("width") var width : Int,
    @SerializedName("height") var height : Int
    )