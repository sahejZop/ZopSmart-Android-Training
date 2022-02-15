package com.example.fragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(), communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfrag = firstfrag()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl, firstfrag)
            commit()
        }
    }

    override fun sendData(editTextinput: String) {
        val secondfrag = secondfrag()
        val bundle = Bundle()
        bundle.putString("name", editTextinput)

        secondfrag.arguments = bundle
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl, secondfrag)
            commit()
        }
    }

}