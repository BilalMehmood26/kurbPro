package com.buzztech.kurbplaceradmin.ui.main.groupChat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzztech.kurbplaceradmin.databinding.ItemInitiateChatBinding

class ChatGroupAdapter :RecyclerView.Adapter<ChatGroupAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemInitiateChatBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemInitiateChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {

        }
    }
}