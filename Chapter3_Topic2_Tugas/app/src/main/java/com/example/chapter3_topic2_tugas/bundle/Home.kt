package com.example.chapter3_topic2_tugas.bundle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.databinding.ActivityHomeBinding


class Home : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getbundel = intent.extras
        val name =getbundel?.getString("nama")
        val tahun_lhr =getbundel?.getString("tahun_lhr")
        binding.textName.text= "halo "+ name
        binding.textTahun.text= "umur kamu "+ tahun_lhr



    }
}