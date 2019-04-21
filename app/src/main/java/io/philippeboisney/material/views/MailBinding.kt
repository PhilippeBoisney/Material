package io.philippeboisney.material.views

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import io.philippeboisney.material.R
import io.philippeboisney.material.model.Mail
import io.philippeboisney.material.model.Picture

object MailBinding {

    @BindingAdapter("app:imageUrl")
    @JvmStatic fun loadImage(view: ImageView, url: String) {
        Glide.with(view.context).load(url).apply(RequestOptions.circleCropTransform()).into(view)
    }

    @BindingAdapter("app:itemsInsideGrid")
    @JvmStatic fun setItemsInsideGrid(recyclerView: RecyclerView, pictures: List<Picture>) {
        recyclerView.adapter = ImageAdapter(pictures, R.layout.item_image_inside_grid)
    }

    @BindingAdapter("app:items")
    @JvmStatic fun setItems(recyclerView: RecyclerView, pictures: List<Picture>) {
        recyclerView.adapter = ImageAdapter(pictures, R.layout.item_image)
    }

    @BindingAdapter("app:attachmentVisibility")
    @JvmStatic fun setAttachmentVisibility(view: ImageView, mail: Mail) {
        view.visibility = if (mail.containsAttachment) View.VISIBLE else View.GONE
    }
}