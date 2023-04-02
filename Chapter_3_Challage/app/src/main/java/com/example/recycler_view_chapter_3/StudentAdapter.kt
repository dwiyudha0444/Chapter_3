package com.example.recycler_view_chapter_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(var listAbjad: ArrayList<ListAbjad>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

    var onClick : ((ListAbjad) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nama = view.findViewById<TextView>(R.id.txtNama)
        var card = view.findViewById<CardView>(R.id.detailCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.nama.text = listAbjad[position].abjad
        holder.card.setOnClickListener{
            onClick?.invoke(listAbjad[position])
        }
    }

    override fun getItemCount(): Int {
        return listAbjad.size
    }

}