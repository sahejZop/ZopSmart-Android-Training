package com.example.loginform.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginform.R
import com.example.loginform.RecyclerAdapter
import com.example.loginform.databinding.FragmentFragment2Binding
import retrofit2.converter.gson.GsonConverterFactory
import com.example.loginform.Api.retrofitInstance
import com.example.loginform.User
import com.example.loginform.retroadapter
import retrofit2.*
import retrofit2.http.Body

/**
 * A simple [Fragment] subclass.
 * Use the [fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment2 : Fragment(R.layout.fragment_fragment2) {

    lateinit var binding: FragmentFragment2Binding
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

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

        val userdata = retrofitInstance.api.fetchAllUsers()
        userdata.enqueue(object : Callback<List<User>>{

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                val data = response.body()
                if (data != null)
                {
                    binding.userList.apply {
                        layoutManager = LinearLayoutManager(activity)
                        adapter = retroadapter(context, data)
                    }
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
            }

        })
    }
}