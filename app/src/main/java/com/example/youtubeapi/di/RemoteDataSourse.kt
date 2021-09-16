package com.example.youtubeapi.di

import org.koin.dsl.module

val RemoteDataSource = module {
    single { RemoteDataSource(get()) }
}