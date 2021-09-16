package com.example.youtubeapi.ui.fragments.detail

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.example.youtubeapi.loco.base.BaseViewModel
import com.example.youtubeapi.playlistitems.PlayList
import com.example.youtubeapi.repository.Repository
import com.example.loco.network.result.Resource

class DetailViewModel(private  val  repository: Repository) : BaseViewModel() {

 @RequiresApi(Build.VERSION_CODES.O)
 fun  fetchPlayListItems(id : String) : LiveData<Resource<PlayList>> {
     return repository.fetchYouTubAPiPlayListItems(id)
 }
}
