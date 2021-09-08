package com.nageshempire.artgallery.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("loadImage", "size", requireAll = false)
    fun loadImage(view: ImageView, imageRes: Int, size: Int?) {
        var glide = Glide.with(view.context)
            .load(imageRes)
        if (size != null) glide = glide.override(size)
        glide.into(view)
    }
}