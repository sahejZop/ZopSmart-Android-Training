package com.example.fragmentdatatransferusingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfrag = fragment1()
        val secondfrag = fragment2()
        var flagFirst: Boolean = true;
        val bt1: Button = findViewById(R.id.bt)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl, firstfrag)
            commit()
        }

        bt1.setOnClickListener{
            if (!flagFirst)
            {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fl, firstfrag)
                    addToBackStack(null)
                    commit()
                }
                flagFirst = true
            }
            else
            {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fl, secondfrag)
                    addToBackStack(null)
                    commit()
                }
                flagFirst = false
            }

        }

    }
}
