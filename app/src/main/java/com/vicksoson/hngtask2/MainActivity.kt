package com.vicksoson.hngtask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.vicksoson.hngtask2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp(binding)
    }
    private fun setUp(binding: ActivityMainBinding){
        val builder = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.result_screen, null)
        builder.setView(view)
        val alertDialog = builder.create()
        val name = view.findViewById<TextView>(R.id.name_textView)
        val track = view.findViewById<TextView>(R.id.track_textView)
        val thanksButton = view.findViewById<Button>(R.id.thanks_button)


        thanksButton.setOnClickListener {
            alertDialog.dismiss()
        }

        binding.goButton.setOnClickListener{
            name.text = binding.nameInput.text.toString()
            track.text = binding.trackInput.text.toString()
            alertDialog.show()
        }
    }
}