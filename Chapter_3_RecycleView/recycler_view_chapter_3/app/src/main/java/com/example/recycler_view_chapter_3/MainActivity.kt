package com.example.recycler_view_chapter_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recycler_view_chapter_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudentData = arrayListOf(
            ListStudent("Andika", 19),
            ListStudent("Ayu",23),
            ListStudent("Dheva", 19),
            ListStudent("Eva", 20),
            ListStudent("Rena", 21),
            ListStudent("Hana", 22),
            ListStudent("Dian", 23),

        )

        val adapterStudent = StudentAdapter(listStudentData)


        val ln = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gl = GridLayout(this,)
        binding.student.layoutManager = ln
        binding.student.adapter = adapterStudent
    }
}