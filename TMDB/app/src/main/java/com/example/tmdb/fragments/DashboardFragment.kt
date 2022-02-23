package com.example.tmdb.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tmdb.R
import com.example.tmdb.adapters.dashboardrecycleradapter
import com.example.tmdb.data.MovieData
import com.example.tmdb.databinding.DashboardBinding

class DashboardFragment : Fragment(){

    val data: List<MovieData> = listOf(MovieData("sahej"), MovieData("paranjal"),
        MovieData("akslfjsa"),MovieData("kjdasd"), MovieData("paranjal"),
        MovieData("paranjal"), MovieData("paranjal"), MovieData("paranjal")
        , MovieData("paranjal"), MovieData("paranjal"))

    lateinit var binding: DashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dashboard, container, false)
        binding = DashboardBinding.inflate(layoutInflater)

        binding.movieslist.apply {
            layoutManager = GridLayoutManager(activity, 3)
            adapter = dashboardrecycleradapter(context, data)
        }

        return binding.root
    }
}