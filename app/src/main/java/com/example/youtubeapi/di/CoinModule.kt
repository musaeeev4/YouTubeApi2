package com.example.youtubeapi.di

import com.example.loco.network.networkModule


val  koinmodule = listOf(
        networkModule,
        repisitoryModul,
        RemoteDataSource          ,
       viewModel
)