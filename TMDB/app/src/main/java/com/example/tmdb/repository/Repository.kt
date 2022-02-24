package com.example.tmdb.repository

import android.util.Log
import com.example.tmdb.apiServices.MovieApiInstance
import com.example.tmdb.data.MovieData
import com.example.tmdb.data.MovieListData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getMovies(): MovieListData? {

        val movieList = MovieApiInstance.api.getMovieList()
        var data: MovieListData? = null

        movieList.enqueue(object : Callback<MovieListData> {

            override fun onResponse(
                call: Call<MovieListData>,
                response: Response<MovieListData>
            ) {
                Log.d("repo", "received response")
                data = response.body()
                if (data == null)
                    Log.d("repo", "response received is null")
            }

            override fun onFailure(call: Call<MovieListData>, t: Throwable) {
                Log.d("repo", "error onfailure")
                //TODO("Not yet implemented")
            }
        })

        return data
    }
}