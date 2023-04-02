package com.example.recycler_view_chapter_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view_chapter_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAbjadData = arrayListOf(
            ListAbjad("A"),
            ListAbjad("B"),
            ListAbjad("C"),
            ListAbjad("D"),
            ListAbjad("E"),
            ListAbjad("F"),
            ListAbjad("G"),
            ListAbjad("H"),
            ListAbjad("I"),
            ListAbjad("J"),

        )

        var adapterStudent = StudentAdapter(listAbjadData)


        val ln = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //val gl = GridLayout(this,)
        binding.student.layoutManager = ln
        binding.student.adapter = adapterStudent

        adapterStudent.onClick={
            val pindah = Intent(this,DetailStudent::class.java)
            pindah.putExtra("detail", it)
            startActivity(pindah)


        }
    }
}