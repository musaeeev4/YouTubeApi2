package com.example.youtubeapi.di

import com.example.youtubeapi.ui.fragments.detail.DetailViewModel
import com.example.youtubeapi.Playlistt.PlayListViewModelFragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module


val viewModel:Module = module {

viewModel { DetailViewModel(get())  }
viewModel { PlayListViewModelFragment(get()) }

}