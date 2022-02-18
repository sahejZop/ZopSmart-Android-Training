package com.example.loginform

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private val namearr = arrayOf("John", "Smith","John", "Smith","John", "Smith","John", "Smith","John", "Smith")
    private val jobId = arrayOf("1234" , "5678","1234" , "5678","1234" , "5678","1234" , "5678","1234" , "5678")
    private val dept = arrayOf("IT", "IT","IT", "IT","IT", "IT","IT", "IT","IT", "IT")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.userlistscreen, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemname.text = namearr[position]
        holder.itemjobId.text = jobId[position]
        holder.itemdept.text = dept[position]
        //holder.itemimgView.setImageResource()
    }

    override fun getItemCount(): Int {
        return namearr.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemname: TextView = itemView.findViewById(R.id.textName)
        var itemjobId: TextView = itemView.findViewById(R.id.textId)
        var itemdept: TextView = itemView.findViewById(R.id.textDepartment)
        var itemimgView: ImageView = itemView.findViewById(R.id.usrImage)

    }
}