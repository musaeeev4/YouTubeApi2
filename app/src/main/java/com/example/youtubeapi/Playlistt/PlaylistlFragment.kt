package com.example.youtubeapi.Playlistt
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youtubeapi.ui.fragments.detail.DetailAdapter
import com.example.youtubeapi.`object`.Constant.KEY_ID
import com.example.youtubeapi.loco.base.BaseFragment
import com.example.youtubeapi.databinding.FragmentDetailBinding
import com.example.youtubeapi.databinding.ScrllingContent2Binding
import com.example.youtubeapi.playlistitems.Items
import com.example.youtubeapi.ui.fragments.detail.DetailViewModel
import com.example.youtubeapi.ui.fragments.detail.OnPlaylistItemClick
import org.koin.androidx.viewmodel.ext.android.viewModel

class   PlaylistlFragment : BaseFragment<FragmentDetailBinding,DetailViewModel>(
    FragmentDetailBinding::inflate

), OnPlaylistItemClick {
    private lateinit var bottomBinding: ScrllingContent2Binding

    override fun setupLiveData() {}
    @RequiresApi(Build.VERSION_CODES.O)
    override fun setupUI() {

        bottomBinding = binding.scrollingContent2
        val item: Items = arguments?.getSerializable(KEY_ID) as Items

        binding.textTitle.text = item.snippet.title
        binding.textDescription.text = item.snippet.description

        viewModel.fetchPlayListItems(item.id).observe(viewLifecycleOwner,{
          bottomBinding.recyclerView.apply {
            val adapter =  it.data?.let { it1 -> DetailAdapter(this@PlaylistlFragment, it1) }
     layoutManager = LinearLayoutManager(context)
              this.adapter = adapter
          }
        })

    }

    override fun onPlaylistItem(videoId: String) {
        Toast.makeText(requireContext(), videoId, Toast.LENGTH_SHORT).show()
    }

    val viewModel: DetailViewModel by viewModel()
}