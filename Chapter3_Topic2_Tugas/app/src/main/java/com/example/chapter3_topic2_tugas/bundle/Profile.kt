package com.example.chapter3_topic2_tugas.bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val profileName = binding.etName.text.toString()
            val profileTahun = binding.etTahun.text.toString()
            val bundle = Bundle()
            val move = Intent(this, Home::class.java)
            bundle.putString("nama", profileName)
            bundle.putString("tahun_lhr", profileTahun)
            move.putExtras(bundle)
            startActivity(move)
        }

    }
}