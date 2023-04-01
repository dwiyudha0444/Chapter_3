package com.example.navigationcomponent_chapter_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent_chapter_3.databinding.FragmentSatuBinding
import com.example.navigationcomponent_chapter_3.databinding.FragmentTigaBinding

class FragmentTiga : Fragment() {

    lateinit var binding: FragmentTigaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTigaBinding.inflate(layoutInflater, container, false)
        return binding.root}
}