package com.example.budgetbudapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Find and set up the Exit button
        val exitButton = findViewById<Button>(R.id.buttonE)
        exitButton.setOnClickListener {
            finish() // Closes the activity
        }
    }
}
