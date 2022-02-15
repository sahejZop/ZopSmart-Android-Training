package com.example.fragmentcommunication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class secondfrag : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    var display: String? = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_secondfrag, container, false)
        super.onCreateView(inflater, container, savedInstanceState)
        display = arguments?.getString("name")
        view.findViewById<TextView>(R.id.tv1).text = display
        return view
    }
}