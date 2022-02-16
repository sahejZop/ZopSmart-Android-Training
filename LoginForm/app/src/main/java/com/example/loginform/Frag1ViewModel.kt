package com.example.loginform

import android.text.TextUtils
import androidx.lifecycle.ViewModel

class Frag1ViewModel: ViewModel(){

    fun checkSignIn(email: String, pwd: String): Boolean
    {
        if (pwd.isBlank())
            return false
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
