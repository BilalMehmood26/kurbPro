package com.buzztech.kurbplaceradmin.ui.main.chatlist

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzztech.kurbplaceradmin.R
import com.buzztech.kurbplaceradmin.adapter.ChatListAdapter
import com.buzztech.kurbplaceradmin.databinding.FragmentChatListBinding
import com.buzztech.kurbplaceradmin.databinding.FragmentGroupChatBinding
import com.buzztech.kurbplaceradmin.model.ChatUser


class ChatListFragment : Fragment() {

    private var _binding: FragmentChatListBinding? = null
    private val binding get() = _binding!!

    private lateinit var chatListAdapter: ChatListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentChatListBinding.bind(view)

        binding.apply {
            groupChatBtn.setOnClickListener {
                findNavController().navigate(R.id.action_chatListFragment_to_groupChatFragment)
            }
        }

        chatListAdapter = ChatListAdapter {
            findNavController().navigate(R.id.action_chatListFragment_to_chatFragment)
        }

        binding.apply {
            chatListRv.apply {
                adapter = chatListAdapter
                layoutManager = GridLayoutManager(requireContext(), 2)
                chatListAdapter.submitList(
                    listOf(
                        ChatUser("Bilal Mehmood", "Android Developer"),
                        ChatUser("Jasika Nicole", "UI/UX Designer"),
                        ChatUser("Jasika Nicole", "Android Developer"),
                        ChatUser("Bilal Mehmood","Android Developer"),
                        ChatUser("Bilal Mehmood","Android Developer")
                    )
                )
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat_list, container, false)
    }
}