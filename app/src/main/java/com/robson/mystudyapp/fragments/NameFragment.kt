package com.robson.mystudyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.robson.mystudyapp.R
import com.robson.mystudyapp.viewmodel.NameViewModel

class NameFragment : Fragment() {

    // Referência ao ViewModel
    private val nameViewModel: NameViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_name, container, false)

        val editTextName = view.findViewById<EditText>(R.id.editTextName)
        val buttonSaveName = view.findViewById<Button>(R.id.buttonSaveName)
        val textViewResult = view.findViewById<TextView>(R.id.textViewResult)

        // Quando clicar no botão, salva o nome no ViewModel
        buttonSaveName.setOnClickListener {
            val typedName = editTextName.text.toString()
            nameViewModel.updateName(typedName)
        }

        // Observa o LiveData para atualizar a UI automaticamente
        nameViewModel.name.observe(viewLifecycleOwner) { name ->
            textViewResult.text = "Nome salvo: $name"
        }

        return view
    }
}
