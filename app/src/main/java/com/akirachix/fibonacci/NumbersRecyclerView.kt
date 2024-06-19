package com.akirachix.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRecyclerView (var numberList: List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: NumbersViewHolder,
        position: Int
//        payloads: MutableList<Any>
    ) {
        val num = position + 2
        holder.tvNumber.text = numberList[position].toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }



}

class NumbersViewHolder(itemView: View): ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}