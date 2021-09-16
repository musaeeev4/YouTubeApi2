package com.example.youtubeapi.playlistitems

import com.google.gson.annotations.SerializedName

data  class PageInfo (
@SerializedName("totalResults") var totalResults : Int,
@SerializedName("resultsPerPage") var resultPerPage : Int
         )