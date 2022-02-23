package com.example.tmdb.apiServices

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieApiInstance {
    val api: movieApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(movieApiInterface::class.java)
    }
}
