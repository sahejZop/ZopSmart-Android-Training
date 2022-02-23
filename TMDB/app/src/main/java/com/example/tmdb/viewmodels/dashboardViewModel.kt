package com.example.tmdb.viewmodels

import android.app.Activity
import android.content.Context
import android.content.pm.ModuleInfo
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.tmdb.apiServices.MovieApiInstance
import com.example.tmdb.data.MovieData
import com.example.tmdb.databinding.DashboardBinding
import com.example.tmdb.fragments.DashboardFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class dashboardViewModel: ViewModel(){

    lateinit var binding: DashboardBinding

    fun getMovies(): List<MovieData>? {

        val movieList = MovieApiInstance.api.getMovieList()
        var data: List<MovieData>? = null

        movieList.enqueue(object : Callback<List<MovieData>> {

            override fun onResponse(
                call: Call<List<MovieData>>,
                response: Response<List<MovieData>>
            ) {
                data = response.body()
            }

            override fun onFailure(call: Call<List<MovieData>>, t: Throwable) {
                Log.d("viewmodel", "error")
                //TODO("Not yet implemented")
            }
        })

            return data
    }
}
