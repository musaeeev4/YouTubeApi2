package com.example.youtubeapi.di

import com.example.youtubeapi.repository.Repository
import org.koin.dsl.module

val repisitoryModul = module {
    single { Repository (get()) }
}