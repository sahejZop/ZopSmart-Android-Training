package com.example.fragmentcommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class firstfrag : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    lateinit var comm: communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_firstfrag, container, false)
        super.onCreateView(inflater, container, savedInstanceState)

        val bt: Button? = view?.findViewById<Button>(R.id.bt)

        comm = activity as communicator

        bt?.setOnClickListener {
            val str: String = view?.findViewById<EditText>(R.id.et1)?.text.toString()
            comm.sendData(str)
        }

        return view

    }
}