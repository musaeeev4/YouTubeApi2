package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data class High (

    @SerializedName("url") var url : String,
    @SerializedName("width") var width : Int,
    @SerializedName("height") var height : Int

)