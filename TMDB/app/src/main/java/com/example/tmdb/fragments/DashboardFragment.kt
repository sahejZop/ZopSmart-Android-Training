package com.example.tmdb.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tmdb.R
import com.example.tmdb.adapters.dashboardrecycleradapter
import com.example.tmdb.data.MovieData
import com.example.tmdb.databinding.DashboardBinding
import com.example.tmdb.repository.Repository
import com.example.tmdb.viewmodels.dashboardViewModel

class DashboardFragment : Fragment(){

    lateinit var binding: DashboardBinding
    private var repository = Repository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.dashboard, container, false)
        binding = DashboardBinding.inflate(layoutInflater)
        //dashViewModelobj = ViewModelProvider(this).get(dashboardViewModel::class.java)

        val data: List<MovieData>? = getMovies()
        /*
        val data: List<MovieData>? = listOf(MovieData("Schindler' List", "9.6",".",
        "1993"))
         */

        binding.movieslist.apply {
            layoutManager = GridLayoutManager(activity, 3)
            adapter = dashboardrecycleradapter(context, data)
        }

        return binding.root
    }

    private fun getMovies(): List<MovieData>? {
        return repository.getMovies()
    }
}