package com.example.loginform

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.loginform.databinding.UserlistscreenBinding

class retroadapter(val context: Context, val data: List<User>) : RecyclerView.Adapter<retroadapter.retroViewHolder>(){

    lateinit var binding : UserlistscreenBinding

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): retroadapter.retroViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.userlistscreen, parent, false)
        return retroViewHolder(view)
    }

    override fun onBindViewHolder(holder: retroadapter.retroViewHolder, position: Int) {
        val dataObj = data[position]
        holder.name.text = dataObj.name
        holder.username.text = dataObj.username
        holder.email.text = dataObj.email
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class retroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var name = binding.textName
        var username = binding.username
        var email = binding.email
    }
}