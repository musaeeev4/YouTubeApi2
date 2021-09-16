package com.example.youtubeapi.repository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.loco.network.result.Resource
import kotlinx.coroutines.Dispatchers

class Repository(private val dataSoucrce: RemoteDataSource) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun fetchYouTubeApiPlayList(): LiveData<Resource<PlayList>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        val response = dataSoucrce.fetchAllPlaylist()
        emit(response)
    }

    fun fetchYouTubAPiPlayListItems(id: String): LiveData<Resource<com.example.youtubeapi.playlistitems.PlayList>> =
        liveData(Dispatchers.IO) {
            emit(Resource.loading(null))
            val response = dataSoucrce.fetchAllPlaylist(id)
            emit(response)
        }
}