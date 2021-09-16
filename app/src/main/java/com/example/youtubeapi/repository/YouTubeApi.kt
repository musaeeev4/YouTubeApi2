package com.example.youtubeapi.repository

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface  YouTubeApi {
    @GET("playlists")
    suspend fun fetchAllPlayList(
        @Query("part") part: String,
        @Query("channelId") channelId: String,
        @Query("maxResults") maxResults: Int,
        @Query("key") apiKey: String,
    ): Response<PlayList>

    @GET("playlistItems")
    suspend fun fetchPlaylistItems(
        @Query("part") part: String,
        @Query("playlistId") playlistId: String,
        @Query("key") apiKey: String,
    ): Response<com.example.youtubeapi.playlistitems.PlayList>
}