package com.example.youtubeapi.Extesion

import android.content.Context
import android.opengl.Visibility
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

fun Context.showMessege(messsage: String?) {
    Toast.makeText(this, messsage, Toast.LENGTH_SHORT).show()
}

fun ImageView.loadImage(context: Context, url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}

var View.visible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }
 var View.invisible:Boolean
get()  = visibility == View.INVISIBLE
set(value){
visibility = if (value) View.INVISIBLE else View.VISIBLE
}