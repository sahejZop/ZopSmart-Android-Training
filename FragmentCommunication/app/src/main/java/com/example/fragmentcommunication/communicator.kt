package com.example.fragmentcommunication

import android.widget.EditText

interface communicator {
    fun sendData(editTextinput: String)
}