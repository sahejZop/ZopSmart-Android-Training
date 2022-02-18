package com.example.loginform

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.loginform.databinding.ActivityMainBinding
import com.example.loginform.databinding.FragmentFragment1Binding

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() {

    val tag_:String = "frag1"
    private lateinit var binding: FragmentFragment1Binding
    private lateinit var f1viewModel: Frag1ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        // Inflate view and obtain an instance of the binding class
        Log.i("GameFragment", "Called ViewModelProvider.get")

        val secondfrag = fragment2()

        binding = FragmentFragment1Binding.inflate(layoutInflater)
        f1viewModel = ViewModelProvider(this).get(Frag1ViewModel::class.java)

        binding.bt1.setOnClickListener{
            val email: String = binding.et1.text.toString()
            val pwd: String = binding.et2.text.toString()
            if (checkSignIn(email, pwd))
            {
                activity?.supportFragmentManager?.beginTransaction()?.apply {
                    replace(R.id.fl, secondfrag)
                    commit()
                }
            }
            binding.et1.error = "fields are typed wrong"
            return@setOnClickListener
        }
        return binding.root
    }

    private fun checkSignIn(email: String, pwd: String): Boolean
    {
        return f1viewModel.checkSignIn(email, pwd)
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

