package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data class RecourseId(
@SerializedName("kind") var kind : String,
@SerializedName("VideoId") var videoId : String
 )
