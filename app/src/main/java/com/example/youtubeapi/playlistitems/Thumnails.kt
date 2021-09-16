package com.example.youtubeapi.playlistite

import com.example.youtubeapi.playlistitems.Higgh
import com.example.youtubeapi.playlistitems.Standard
import com.google.gson.annotations.SerializedName

data class Thumnails(
    @SerializedName("deafault") var default : Defult,
    @SerializedName("mediom") var mediom : Mediom,
    @SerializedName("high") var high : Higgh,
    @SerializedName("standart") var standart : Standard,
    @SerializedName("maxres") var maxres : Maxres,
 )