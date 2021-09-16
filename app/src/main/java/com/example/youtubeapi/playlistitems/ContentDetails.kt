package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data class ContentDetails(
 @SerializedName("VideoId") var video : String,
  @SerializedName("videoPublisheaAt") var videoPublisheat :String
)