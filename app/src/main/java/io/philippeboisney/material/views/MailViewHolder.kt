package io.philippeboisney.material.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.material.databinding.ItemMailBinding
import io.philippeboisney.material.model.Mail

class MailViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

    private val binding = ItemMailBinding.bind(parent)

    fun bindTo(mail: Mail, listener: MailAdapter.Listener) {
        itemView.setOnClickListener { listener.onClick(mail, binding.itemMailBackground, binding.itemMailAvatar); }
        binding.mail = mail
    }
}