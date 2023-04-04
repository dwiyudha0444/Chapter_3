package com.example.chapter3_topic2_tugas.Parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.Serializable.DataAndroidSeria
import com.example.chapter3_topic2_tugas.databinding.ActivityInputDataParcelBinding

class InputDataPercel : AppCompatActivity() {
    lateinit var binding: ActivityInputDataParcelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputDataParcelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val dataPercel = DataAndroidPercel("yudha", 20, "0895392073353")
            val move = Intent(this, ActivityDataPercel::class.java)
            move.putExtra("DATAPERCEL", dataPercel)
            startActivity(move)

        }
    }
}