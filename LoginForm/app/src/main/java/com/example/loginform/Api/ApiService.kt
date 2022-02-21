package com.example.loginform.Api

import com.example.loginform.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/users")
    fun fetchAllUsers(): Response<List<User>>
}