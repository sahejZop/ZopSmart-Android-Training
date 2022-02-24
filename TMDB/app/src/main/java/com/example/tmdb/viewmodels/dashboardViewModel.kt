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

}
