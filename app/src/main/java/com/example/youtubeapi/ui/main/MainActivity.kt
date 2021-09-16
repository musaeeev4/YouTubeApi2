package com.example.youtubeapi.ui.main

import com.example.youtubeapi.databinding.ActivityMainBinding
import com.example.youtubeapi.loco.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>(ActivityMainBinding::inflate,MainViewModel::class.java){
    override fun setUpView() {
    }
}