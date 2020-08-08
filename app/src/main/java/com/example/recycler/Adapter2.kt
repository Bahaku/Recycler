package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycle_2.view.*



class Adapter2 (private val arra: ArrayList<String>): RecyclerView.Adapter<Holder2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder2 {
        val gde = LayoutInflater.from(parent.context).inflate(R.layout.recycle_2, parent, false)
        val kholder = Holder2(gde)
        return kholder
    }

    override fun getItemCount(): Int {
        return arra.size
    }

    override fun onBindViewHolder(holder: Holder2, position: Int) {
        val item = arra[position]
        holder.bind(item)
    }



}
class Holder2(gde: View) : RecyclerView.ViewHolder(gde){
fun bind(item2: String) {
    itemView.text2.text = item2
}
}
