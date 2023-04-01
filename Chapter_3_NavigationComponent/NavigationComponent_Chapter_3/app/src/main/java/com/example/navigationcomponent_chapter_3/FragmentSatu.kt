package com.example.navigationcomponent_chapter_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent_chapter_3.databinding.FragmentSatuBinding

class FragmentSatu : Fragment() {

    lateinit var binding: FragmentSatuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSatuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSatu.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentSatu_to_fragmentDua)
        }
    }
}