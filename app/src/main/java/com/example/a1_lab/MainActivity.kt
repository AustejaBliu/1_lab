package com.example.a1_lab

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView = findViewById<TextView>(R.id.textViewResult)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)

        btnChangeText.setOnClickListener {
            textView.text = "Sveikas, Pasauli!"
        }
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)

        btnChangeColor.setOnClickListener {
            textView.setTextColor(Color.GREEN)
        }
        val btnChangeBgColor = findViewById<Button>(R.id.btnChangeBgColor)

        btnChangeBgColor.setOnClickListener {
            textView.setBackgroundColor(Color.BLUE)
        }
    }
}