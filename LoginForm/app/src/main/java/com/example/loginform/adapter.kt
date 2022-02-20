package com.example.loginform

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(val dataList: List<List<String>>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.userlistscreen, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemname.text = "Name:"  + dataList[position][0]
        holder.itemjobId.text = "Job ID:" + dataList[position][1]
        holder.itemdept.text = "Dept.: " + dataList[position][2]
        //holder.itemimgView.setImageResource()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemname: TextView = itemView.findViewById(R.id.textName)
        var itemjobId: TextView = itemView.findViewById(R.id.textId)
        var itemdept: TextView = itemView.findViewById(R.id.textDepartment)
        var itemimgView: ImageView = itemView.findViewById(R.id.usrImage)

    }
}