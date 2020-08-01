package com.example.learnviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val model: CustomViewModel = ViewModelProvider(this).get(CustomViewModel::class.java)
        textView.text = model.cout.toString()
        button.setOnClickListener {
            model.cout++
            textView.text = model.cout.toString()
        }

        buttonGoToMain2.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
    }
}