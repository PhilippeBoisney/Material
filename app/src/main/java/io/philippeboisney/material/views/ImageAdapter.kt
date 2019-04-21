package io.philippeboisney.material.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IntegerRes
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.material.R
import io.philippeboisney.material.model.Picture

class ImageAdapter(private val pictures: List<Picture>,
                   private val layoutId: Int): RecyclerView.Adapter<ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
        = ImageViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))

    override fun getItemCount(): Int
        = pictures.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int)
        = holder.bindTo(pictures[position])
}