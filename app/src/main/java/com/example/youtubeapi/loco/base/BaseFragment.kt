package com.example.youtubeapi.loco.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding,VM : BaseViewModel>( private  val inflate: (LayoutInflater,ViewGroup? , Boolean) ->Binding ):Fragment() {

    private var _binding: Binding? = null
    val binding get() = _binding!!
    //   val viewModel: ada by viewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        setupLiveData()
        setupUI()
        return binding.root
    }

    abstract fun setupUI()
    abstract fun setupLiveData ()
}