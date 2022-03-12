package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerView(val context: Context, val items: MutableList<UserModel>): RecyclerView.Adapter<MyRecyclerView.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false)
    return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val userModel = items.get(position)
        holder.nameTxt.text = userModel.name
        holder.descriptionTxt.text = userModel.description
        holder.icon.setImageResource(userModel.iconResource)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var nameTxt:TextView
        var descriptionTxt: TextView
        var icon:ImageView
        init {
        nameTxt = view.findViewById(R.id.title_row)
        descriptionTxt = view.findViewById(R.id.description_row)
         icon = view.findViewById(R.id.icon_row)
        }
    }
}