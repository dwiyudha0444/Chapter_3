package com.example.chapter3_topic2_tugas.Serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.databinding.ActivityInputDataSeriaBinding

class InputDataSeria : AppCompatActivity() {
    lateinit var binding : ActivityInputDataSeriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputDataSeriaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.seriaButton.setOnClickListener{
            val dataSeria = DataAndroidSeria("yudha","202053062","0895392073353")
            val move = Intent(this, ActivityDataSeria::class.java)
            move.putExtra("DATASERIA", dataSeria)
            startActivity(move)
        }
    }


}