package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginform.fragments.fragment1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfrag = fragment1()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl, firstfrag)
            commit()
        }
    }
}