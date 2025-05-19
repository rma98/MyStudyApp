package com.robson.mystudyapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.robson.mystudyapp.R
import android.graphics.drawable.ColorDrawable
import android.view.WindowManager
import android.widget.Button

class FullScreenMessageFragment : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.Theme_Material_Light_NoActionBar_Fullscreen)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_full_screen_message, container, false)

        val closeButton = view.findViewById<Button>(R.id.btnClose)
        closeButton.setOnClickListener {
            dismiss() // Fecha o fragmento
        }

        return view
    }
}
