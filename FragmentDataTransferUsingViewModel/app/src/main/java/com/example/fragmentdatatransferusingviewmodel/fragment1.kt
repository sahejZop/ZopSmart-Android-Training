package com.example.fragmentdatatransferusingviewmodel

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment(R.layout.fragment_fragment1) {

    val tag_:String = "frag1"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(tag_, "onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag_, "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag_, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag_, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag_, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag_, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag_, "onDestroy called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(tag_, "onDestroyView called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(tag_, "onDetach called")
    }
}

