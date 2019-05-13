package io.philippeboisney.material.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.philippeboisney.material.R
import io.philippeboisney.material.model.Picture

class ImageViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

    fun bindTo(picture: Picture) {
        Glide.with(itemView.context)
            .load(picture.url)
            .into(itemView.findViewById(R.id.item_image_image_view))
    }
}