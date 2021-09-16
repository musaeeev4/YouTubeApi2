package com.example.youtubeapi

import android.app.Application
import com.example.youtubeapi.di.koinmodule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class YouTubeApp : Application() {
    override fun onCreate() {
        super.onCreate()
         startKoin {androidContext(this@YouTubeApp)
         modules(koinmodule)}

     }
}