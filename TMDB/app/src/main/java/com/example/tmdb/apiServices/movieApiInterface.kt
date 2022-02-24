package com.example.tmdb.apiServices

import com.example.tmdb.data.MovieData
import retrofit2.Call
import retrofit2.http.GET

interface movieApiInterface {

    //@GET("/movielist.json")
    @GET("/3/movie/popular?api_key=286fe5ed7f42deec75f227d9df455b36")
    fun getMovieList(): Call<List<MovieData>>
}