package com.example.tmdb.apiServices

import com.example.tmdb.data.MovieData
import com.example.tmdb.data.MovieListData
import retrofit2.Call
import retrofit2.http.GET

interface movieApiInterface {

    //@GET("/movielist.json")
    @GET("movie/popular?api_key=286fe5ed7f42deec75f227d9df455b36&language=en-US")
    //@GET("/users")
    fun getMovieList(): Call<MovieListData>
}