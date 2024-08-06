package com.buzztech.kurbplaceradmin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.buzztech.kurbplaceradmin.databinding.ItemChatListBinding
import com.buzztech.kurbplaceradmin.model.ChatUser

class ChatListAdapter(private val itemClick: (item: ChatUser) -> Unit) :
    ListAdapter<ChatUser, ChatListAdapter.ViewHolder>(DiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemChatListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bindData(item)
    }

    inner class ViewHolder(val binding: ItemChatListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(value: ChatUser) {
            binding.apply {
                titleTv.text = value.name
                subTitleTv.text = value.designation
                root.setOnClickListener {
                    itemClick.invoke(value)
                }
            }
        }

    }

    class DiffUtilCallBack : DiffUtil.ItemCallback<ChatUser>() {
        override fun areItemsTheSame(oldItem: ChatUser, newItem: ChatUser) = oldItem == newItem

        override fun areContentsTheSame(oldItem: ChatUser, newItem: ChatUser) = oldItem == newItem
    }

}