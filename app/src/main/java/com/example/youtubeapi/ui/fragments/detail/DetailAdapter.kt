package com.example.ui.fragments.detail
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapi.Extesion.loadImage
import com.example.youtubeapi.databinding.ItemPlaylistBinding
import com.example.youtubeapi.playlistitems.Items
import com.example.youtubeapi.playlistitems.PlayList
import com.example.youtubeapi.ui.fragments.detail.OnPlaylistItemClick

class DetailAdapter(
    private val listener: OnPlaylistItemClick,
    private val playListItems: PlayList
) :
    RecyclerView.Adapter<DetailAdapter.ViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            ItemPlaylistBinding.inflate(LayoutInflater.from(context), parent, false),
            context as Context
        )
    }

    override fun getItemCount() = playListItems.items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPhoto(playListItems.items[position])
    }

    inner class ViewHolder(private val view: ItemPlaylistBinding, private val context: Context):
        RecyclerView.ViewHolder(view.root) {

        fun bindPhoto(item: Items) {
            view.textTitle.text = item.snippet.title
            view.imageView.loadImage(context, item.snippet.thumbnails.default.url)
            view.root.setOnClickListener {
                listener.onPlaylistItem(item.id)
            }
        }
    }
}