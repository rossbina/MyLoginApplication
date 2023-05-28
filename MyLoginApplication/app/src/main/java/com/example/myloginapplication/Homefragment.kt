package com.example.myloginapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import org.w3c.dom.Text

class Homefragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_homefragment, container, false)
        // Inflate the layout for this fragment
        val username: TextView = view.findViewById(R.id.username)
        val signUpLink: TextView = view.findViewById(R.id.signuplink)
        val password: TextView = view.findViewById(R.id.password)
        val buttonlogin: MaterialButton = view.findViewById(R.id.loginbtn)

        buttonlogin.setOnClickListener {
            if (username.text.toString().equals("admin") && password.text.toString()
                    .equals("admin")
            ) {
                Toast.makeText(activity, "Login sucessfull", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_homefragment_to_dataFragment)
            } else {
                Toast.makeText(activity, "Wrong username or password", Toast.LENGTH_SHORT).show()

            }
        }

        signUpLink.setOnClickListener{
            findNavController().navigate(R.id.action_homefragment_to_signUpFragment)
        }



        return view

    }

}