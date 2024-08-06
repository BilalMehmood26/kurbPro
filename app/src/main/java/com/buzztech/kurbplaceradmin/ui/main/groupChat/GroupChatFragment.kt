package com.buzztech.kurbplaceradmin.ui.main.groupChat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzztech.kurbplaceradmin.R
import com.buzztech.kurbplaceradmin.databinding.FragmentChatBinding
import com.buzztech.kurbplaceradmin.databinding.FragmentGroupChatBinding

class GroupChatFragment : Fragment() {

    private var _binding: FragmentGroupChatBinding? = null
    private val binding get() = _binding!!
    private lateinit var chatGroupAdapter: ChatGroupAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGroupChatBinding.inflate(layoutInflater)

        binding.apply {
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }

            chatGroupAdapter = ChatGroupAdapter()
            chatRv.apply {
                adapter = chatGroupAdapter
                layoutManager = LinearLayoutManager(
                    requireActivity(),
                    LinearLayoutManager.VERTICAL, false
                )
            }
        }
        return binding.root
    }
}