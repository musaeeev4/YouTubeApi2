package com.example.youtubeapi.playlistitems

import android.graphics.pdf.PdfDocument
import com.google.gson.annotations.SerializedName

data class PlayList(
@SerializedName("kind") var kind :String,
@SerializedName("etag") var etag : String,
@SerializedName("items") var items :List<Items>,
@SerializedName("pageInfo") var pageInfo : PageInfo
)
