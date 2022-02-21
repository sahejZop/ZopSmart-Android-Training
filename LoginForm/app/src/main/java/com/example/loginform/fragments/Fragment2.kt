package com.example.loginform.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginform.Api.ApiService
import com.example.loginform.R
import com.example.loginform.RecyclerAdapter
import com.example.loginform.databinding.FragmentFragment2Binding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.loginform.Api.retrofitInstance
import retrofit2.Callback
import retrofit2.create

/**
 * A simple [Fragment] subclass.
 * Use the [fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment2 : Fragment(R.layout.fragment_fragment2) {

    lateinit var binding: FragmentFragment2Binding
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    val data : List<List<String>> = listOf(listOf("John","1234","IT"),
        listOf("John","1234","IT"),listOf("John","1234","IT"),listOf("John","1234","IT"),
        listOf("John","1234","IT"),listOf("John","1234","IT"),listOf("John","1234","IT"),
        listOf("John","1234","IT"),listOf("John","1234","IT"),listOf("John","1234","IT"))


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFragment2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.userList.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RecyclerAdapter(data)
        }
    }
}