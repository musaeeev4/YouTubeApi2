package com.example.youtubeapi.Playlistt

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.youtubeapi.Playlistt.PlayList
import com.example.youtubeapi.loco.base.BaseViewModel
import com.example.youtubeapi.repository.Repository

class PlayListViewModelFragment(private val  repository : Repository) : BaseViewModel() {

     var loading = MutableLiveData<Boolean>()

    @RequiresApi(Build.VERSION_CODES.O)
    fun fetchPlayList() : LiveData<com.example.loco.network.result.Resource<PlayList>> {
      return repository.fetchYouTubeApiPlayList()
    }
}
