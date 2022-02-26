package com.example.tmdb.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tmdb.R
import com.example.tmdb.adapters.dashboardrecycleradapter
import com.example.tmdb.apiServices.MovieApiInstance
import com.example.tmdb.data.MovieData
import com.example.tmdb.data.MovieListData
import com.example.tmdb.databinding.DashboardBinding
import com.example.tmdb.repository.Repository
import com.example.tmdb.viewmodels.dashboardViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardFragment : Fragment(){

    lateinit var binding: DashboardBinding
    private var repository = Repository()
    var data: MovieListData? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        /*
        val view = inflater.inflate(R.layout.dashboard, container, false)
        dashViewModelobj = ViewModelProvider(this).get(dashboardViewModel::class.java)
         */
        data = getMovies()

        binding = DashboardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (data != null)
        {
            Log.d("dash", "data not null")
            binding.movieslist.apply {
                layoutManager = GridLayoutManager(activity, 3)
                adapter = dashboardrecycleradapter(context, data!!)
            }
        }
        else {
            Log.d("dash", "data is null")
        }
        /*
        val movieList = MovieApiInstance.api.getMovieList()
        movieList.enqueue(object : Callback<MovieListData> {

            override fun onResponse(
                call: Call<MovieListData>,
                response: Response<MovieListData>
            ) {
                val data = response.body()
                if (data == null)
                    Log.d("dashboard", "response is null")

                else
                {
                    Log.d("dashboard", "response is good")
                    binding.movieslist.apply {
                        layoutManager = GridLayoutManager(activity, 3)
                        adapter = dashboardrecycleradapter(context, data)
                    }
                }
            }

            override fun onFailure(call: Call<MovieListData>, t: Throwable) {
                Log.d("dashboard", "$t")
                //TODO("Not yet implemented")
            }
        })

         */
    }


    private fun getMovies(): MovieListData? {
        return repository.getMovies()
    }
}