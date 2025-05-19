package com.robson.mystudyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.robson.mystudyapp.R

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar o layout do fragmento
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // Referência ao botão de voltar
        val btnBackHome = view.findViewById<Button>(R.id.btnBackHome)

        // Ação de clique para voltar ao HomeFragment
        btnBackHome.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        return view
    }
}
