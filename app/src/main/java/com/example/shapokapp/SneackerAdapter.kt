package com.example.shapokapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SneackerAdapter(private val sneackerListtt:ArrayList<Sneacker>)
    : RecyclerView.Adapter<SneackerAdapter.CarViewHolder>(){

    class CarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return CarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sneackerListtt.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = sneackerListtt[position]
        holder.imageView.setImageResource(car.image)
        holder.textView.text = car.name

    }
}