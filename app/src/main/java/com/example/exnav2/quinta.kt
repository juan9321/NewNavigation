package com.example.exnav2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class quinta : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.quinto_fragment, container, false)
        view.findViewById<Button>(R.id.btnFF).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentE_to_fragmentF)
        }
        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            quinta().apply {
                arguments = Bundle().apply {

                }
            }
    }
}