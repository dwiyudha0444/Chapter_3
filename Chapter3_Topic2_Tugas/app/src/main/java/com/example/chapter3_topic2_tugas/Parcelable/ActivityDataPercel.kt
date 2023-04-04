package com.example.chapter3_topic2_tugas.Parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3_topic2_tugas.databinding.ActivityDataPercelBinding

class ActivityDataPercel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var dataPercel = intent.getParcelableArrayExtra("DATAPARCEL") as DataAndroidPercel?
        textParcel.text = dataPercel?.name.toString()
        dataPercel?.name
    }
}