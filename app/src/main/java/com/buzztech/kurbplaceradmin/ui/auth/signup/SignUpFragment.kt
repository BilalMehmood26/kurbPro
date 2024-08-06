package com.buzztech.kurbplaceradmin.ui.auth.signup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.buzztech.kurbplaceradmin.MainActivity
import com.buzztech.kurbplaceradmin.R
import com.buzztech.kurbplaceradmin.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {


    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignUpBinding.bind(view)

        binding.apply {

            continueBtn.setOnClickListener {
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }
            signupBtn.setOnClickListener {
                findNavController().popBackStack()
            }
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

}