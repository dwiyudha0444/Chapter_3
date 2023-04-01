package com.example.navigationcomponent_chapter_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent_chapter_3.databinding.FragmentDuaBinding
import com.example.navigationcomponent_chapter_3.databinding.FragmentSatuBinding

class FragmentDua : Fragment() {

    lateinit var binding: FragmentDuaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDuaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDua.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentDua_to_fragmentTiga)
        }
    }

}