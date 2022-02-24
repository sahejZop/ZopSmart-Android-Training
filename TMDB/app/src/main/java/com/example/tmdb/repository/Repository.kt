package com.example.tmdb.repository

import android.util.Log
import com.example.tmdb.apiServices.MovieApiInstance
import com.example.tmdb.data.MovieData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getMovies(): List<MovieData>? {

        val movieList = MovieApiInstance.api.getMovieList()
        var data: List<MovieData>? = null

        movieList.enqueue(object : Callback<List<MovieData>> {

            override fun onResponse(
                call: Call<List<MovieData>>,
                response: Response<List<MovieData>>
            ) {
                Log.d("viewmodel", "received response")
                data = response.body()
            }

            override fun onFailure(call: Call<List<MovieData>>, t: Throwable) {
                Log.d("viewmodel", "error onfailure")
                //TODO("Not yet implemented")
            }
        })

        if (data == null)
            Log.d("viewmodel", "data is null")

        return data
    }
}