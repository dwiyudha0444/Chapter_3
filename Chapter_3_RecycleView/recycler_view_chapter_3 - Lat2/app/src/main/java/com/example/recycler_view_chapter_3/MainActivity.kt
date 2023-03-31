package com.example.recycler_view_chapter_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view_chapter_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listData = arrayListOf(
            List("Judul News 1", 25 , "Musik", R.drawable.gmbr),
            List("Judul News 2",23, "Olahraga", R.drawable.gmbr),
            List("Judul News 3", 19,"Film", R.drawable.gmbr),
            List("Judul News 4", 20,"Politik", R.drawable.gmbr),
            List("Judul News 5", 21, "Musik", R.drawable.gmbr),
            List("Judul News 6", 22, "Film", R.drawable.gmbr),
            List("Judul News 7", 23, "Kuliner", R.drawable.gmbr),
            List("Judul News 8", 23, "Kuliner", R.drawable.gmbr),
            List("Judul News 9",23, "Olahraga", R.drawable.gmbr),
            List("Judul News 10", 20,"Politik", R.drawable.gmbr),

        )

        val adapterStudent = Adapter(listData)


        val ln = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gl = GridLayout(this,)
        binding.item.layoutManager = ln
        binding.item.adapter = adapterStudent
    }
}