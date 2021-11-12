package com.example.bottomsheetexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.modabottomsheet.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        detailBtn.setOnClickListener { showModalBottomSheet() }
    }

//    private fun showModalBottomSheet() {
//     ModalBottomSheetFragment().show(supportFragmentManager,"BottomSheeet")
//    }

    private fun showModalBottomSheet() {
      val modalbs=BottomSheetDialog(this)
        modalbs.setContentView(R.layout.modabottomsheet)
        val btn=modalbs.findViewById<CardView>(R.id.AndroiCardView)
        btn?.setOnClickListener {
            Toast.makeText(this,"Android",Toast.LENGTH_LONG).show()
            modalbs.dismiss()
        }
        modalbs.show()
    }
}