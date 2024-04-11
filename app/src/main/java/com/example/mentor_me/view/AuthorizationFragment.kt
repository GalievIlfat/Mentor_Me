package com.example.mentor_me.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.mentor_me.R


class AuthorizationFragment : Fragment() {

    private lateinit var editTextLogin: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var forgotPassword: TextView
    private lateinit var createANewAccount: TextView
    private lateinit var logInButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflater = inflater.inflate(R.layout.fragment_authorization, container, false)
        init(inflater)
        createANewAccount.setOnClickListener {
            findNavController().navigate(R.id.action_authorizationFragment_to_registrationFragment)
        }
        return inflater
    }

    private fun init(view: View){
        editTextLogin = view.findViewById(R.id.editTextLogin)
        editTextPassword = view.findViewById(R.id.editTextPassword)
        forgotPassword = view.findViewById(R.id.forgotPassword)
        createANewAccount = view.findViewById(R.id.createANewAccount)
        logInButton = view.findViewById(R.id.logInButton)
    }
}