package com.example.formapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.d("act2", "Act2 created")

        val name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.text_center).apply{
            text = "Hello " + name.toString()
        }

    }
}
