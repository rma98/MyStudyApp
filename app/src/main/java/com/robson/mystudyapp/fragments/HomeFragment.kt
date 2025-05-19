package com.robson.mystudyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.robson.mystudyapp.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Pegando os botões do layout
        val btnGoToLogin = view.findViewById<Button>(R.id.btnGoToLogin)
        val btnGoToRegister = view.findViewById<Button>(R.id.btnGoToRegister)
        val btnShowProducts = view.findViewById<Button>(R.id.btnShowProducts)
        val btnShowFullscreen = view.findViewById<Button>(R.id.btnShowFullscreen)

        // Navega para tela de login
        btnGoToLogin.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LoginFragment())
                .addToBackStack(null)
                .commit()
        }
        // Navega para tela de cadastro
        //btnGoToRegister.setOnClickListener {
            //parentFragmentManager.beginTransaction()
            //.replace(R.id.fragment_container, RegisterFragment())
            //.addToBackStack(null)
        //.commit()
        //}
        btnGoToRegister.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, NameFragment())
                .addToBackStack(null)
                .commit()
        }
        // Navega para tela de produtos
        btnShowProducts.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ProductFragment.newInstance(2))
                .addToBackStack(null)
                .commit()
        }
        btnShowFullscreen.setOnClickListener {
            val fullscreenFragment = FullScreenMessageFragment()
            fullscreenFragment.show(parentFragmentManager, "fullscreen")
        }

        return view
    }
}
