package com.example.recycler_view_chapter_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list: ArrayList<List>) : RecyclerView.Adapter<Adapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var judul = view.findViewById<TextView>(R.id.txtJudul)
        var tgl = view.findViewById<TextView>(R.id.txtTgl)
        var kategori = view.findViewById<TextView>(R.id.txtKategori)
        var img = view.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.judul.text = list[position].judul
        holder.tgl.text = list[position].tgl.toString()
        holder.kategori.text = list[position].kategori
        holder.img.setImageResource(list[position].img)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}