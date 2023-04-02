package com.example.recycler_view_chapter_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view_chapter_3.databinding.ActivityDetailStudentBinding

class DetailStudent : AppCompatActivity() {

    lateinit var binding: ActivityDetailStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAbjadData = arrayListOf(
            ListAbjad("Andika"),
            ListAbjad("Ayu"),
            ListAbjad("Dheva"),
            ListAbjad("Eva"),
            ListAbjad("Rena"),
            ListAbjad("Hana"),
            ListAbjad("Dian"),

            )
        var adapterStudent = StudentAdapter(listAbjadData)


        val ln = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gl = GridLayout(this,)
        binding.student.layoutManager = ln
        binding.student.adapter = adapterStudent

        adapterStudent.onClick={
            val query = "okey"
            val url = "https://www.google.com/search?q=$query"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)

            startActivity(intent)
        }

    }
}