package com.example.tmdb.adapters

import android.content.Context
import android.graphics.Movie
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb.R
import com.example.tmdb.data.MovieData
import com.example.tmdb.databinding.MoviecardBinding

class dashboardrecycleradapter(val context: Context, val moviesList : List<MovieData>?) : RecyclerView.Adapter<dashboardrecycleradapter.viewHolder>() {

    lateinit var binding : MoviecardBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dashboardrecycleradapter.viewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.moviecard, parent, false)
        binding = MoviecardBinding.bind(view)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: dashboardrecycleradapter.viewHolder, position: Int) {
        val dataObj = moviesList?.get(position)
        holder.moviename.text = dataObj?.title
        holder.rating.text = dataObj?.vote_average
        holder.releaseDate.text = dataObj?.release_date

    }

    override fun getItemCount(): Int {
        if (moviesList == null)
        {
            Log.d("adapter", "null h")
            return 0
        }
        return moviesList.size
    }

    inner class viewHolder(view: View): RecyclerView.ViewHolder(view){
        var moviename = binding.movienameText
        var movieimg = binding.movieimg
        var releaseDate = binding.releaseDate
        var rating = binding.rating
    }

}