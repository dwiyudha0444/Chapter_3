package com.example.chapter3_topic2_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.Serializable.InputDataSeria
import com.example.chapter3_topic2_tugas.Parcelable.InputDataPercel
import com.example.chapter3_topic2_tugas.bundle.Home
import com.example.chapter3_topic2_tugas.bundle.Profile
import com.example.chapter3_topic2_tugas.databinding.ActivityInputDataParcelBinding
import com.example.chapter3_topic2_tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bundleButton.setOnClickListener {
            val bundle = Bundle()
            val move = Intent(this, Profile::class.java)
            move.putExtras(bundle)
            startActivity(move)
        }

        binding.seriaButton.setOnClickListener {
            val bundle = Bundle()
            val move = Intent(this, InputDataSeria::class.java)
            move.putExtras(bundle)
            startActivity(move)
        }

        binding.parcelButton.setOnClickListener {
            val bundle = Bundle()
            val move = Intent(this, InputDataPercel::class.java)
            move.putExtras(bundle)
            startActivity(move)
        }
    }
}