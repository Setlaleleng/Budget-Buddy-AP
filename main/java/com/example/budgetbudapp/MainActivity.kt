package com.example.budgetbudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextPageButton = findViewById<Button>(R.id.Next)
        nextPageButton.setOnClickListener {
            val intent = Intent(this, ActivityNextPage::class.java)
            startActivity(intent)
        }
    }
}


class ActivityNextPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)
    }
}
