package com.example.bottomsheetexamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.modabottomsheet.*


class ModalBottomSheetFragment : BottomSheetDialogFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.modabottomsheet, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        AndroiCardView.setOnClickListener {
            Toast.makeText(context,"Android",Toast.LENGTH_LONG).show()
        }
    }
}