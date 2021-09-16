package com.example.youtubeapi.repository

import com.example.youtubeapi.`object`.Constant


class RemoteDataSource(private var apiSerivece: YouTubeApi) : BaseDataSource() {
    suspend fun fetchAllPlaylist() = getruslt {
        apiSerivece.fetchAllPlayList(
            Constant.PART,
            Constant.CHANNEL_ID,
            Constant.MAX_RESULT,
            Constant.API_KEY
        )

    }

    suspend fun fetchAllPlaylistITems(id: String) = getruslt {
        apiSerivece.fetchPlaylistItems(
            Constant.PART,
            id,
            Constant.API_KEY)

    }

}
