package com.example.forexam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.forexam.model.Country

class MyCountryAdapter(private val context: Context,private val countryList: List<Country>): RecyclerView.Adapter<MyCountryAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView
        init {
            title = itemView.findViewById(R.id.item_layout)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = countryList[position]

        holder.title.text = countryList[position].Country
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }


}