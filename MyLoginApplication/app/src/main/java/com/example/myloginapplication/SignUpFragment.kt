package com.example.myloginapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        val buttonsignup: MaterialButton = view.findViewById(R.id.signupbtn)

        buttonsignup.setOnClickListener {
                // inserire codice per aggiungere valori a db
                findNavController().navigate(R.id.action_signUpFragment_to_homefragment)
        }


        // Inflate the layout for this fragment
        return return view
    }
}