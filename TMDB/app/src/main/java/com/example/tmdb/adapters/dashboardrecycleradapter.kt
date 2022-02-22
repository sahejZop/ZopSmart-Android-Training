package com.example.tmdb.adapters

import android.content.Context
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb.R
import com.example.tmdb.data.MovieData
import com.example.tmdb.databinding.MoviecardBinding

class dashboardrecycleradapter(val context: Context, val moviesList : List<MovieData>) : RecyclerView.Adapter<dashboardrecycleradapter.viewHolder>() {

    lateinit var binding : MoviecardBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dashboardrecycleradapter.viewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.moviecard, parent, false)
        binding = MoviecardBinding.bind(view)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: dashboardrecycleradapter.viewHolder, position: Int) {
        val dataObj = moviesList[position]
        holder.name.text = dataObj.name
    }

    override fun getItemCount(): Int {
        return 4
    }

    inner class viewHolder(view: View): RecyclerView.ViewHolder(view){
        var name = binding.movienameText
    }

}