package com.example.loginform

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginform.databinding.FragmentFragment1Binding
import com.example.loginform.databinding.FragmentFragment2Binding
import java.nio.file.Files.find

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
        binding.userList.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RecyclerAdapter()
        }
    }
}