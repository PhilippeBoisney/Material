package io.philippeboisney.material.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.philippeboisney.material.R
import io.philippeboisney.material.model.Mail
import io.philippeboisney.material.model.utils.DataGenerator.MAILS

class MailAdapter(private val listener: Listener): RecyclerView.Adapter<MailViewHolder>() {

    interface Listener {
        fun onClick(mail: Mail, rootView: View, imageView: View)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder
        = MailViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_mail, parent, false))

    override fun getItemCount(): Int
        = MAILS.size

    override fun onBindViewHolder(holder: MailViewHolder, position: Int)
        = holder.bindTo(MAILS[position], listener)
}