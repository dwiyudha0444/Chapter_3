package com.example.chapter3_topic2_tugas.Serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.databinding.ActivityDataSeriaBinding

class ActivityDataSeria : AppCompatActivity() {
    lateinit var binding: ActivityDataSeriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataSeriaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getDataSeria = intent.getSerializableExtra("DATASERIA") as DataAndroidSeria
        val nama = getDataSeria.name
        val email = getDataSeria.email

        binding.text.text= getDataSeria.name

    }
}