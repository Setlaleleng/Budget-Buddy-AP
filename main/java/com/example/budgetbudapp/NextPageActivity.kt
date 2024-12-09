package com.example.budgetbudapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextPageActivity : AppCompatActivity() {

    private val teams = arrayOf(
        "2024-10-11, morning spending R40, Afternoon spending R10",
        "2024-10-12, morning spending R100, Afternoon spending R67",
        "2024-10-13, morning spending R50, Afternoon spending R0",
        "2024-10-14, morning spending R33, Afternoon spending R95",
        "2024-10-15, morning spending R24, Afternoon spending R150"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)

        // Exit button setup
        val exitButton = findViewById<Button>(R.id.buttonE)
        exitButton.setOnClickListener {
            finish() // Close the activity
        }

        // Next button setup (optional navigation to another activity)
        val nextButton = findViewById<Button>(R.id.buttonN)
        nextButton.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java) // Update with actual target activity
            startActivity(intent)
        }

        // Display data in the TextView
        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)
        val selectedDayIndex = intent.getIntExtra("selectedDayIndex", 0) // Default to 0 if not provided

        if (selectedDayIndex in teams.indices) {
            teamsTextView.text = teams[selectedDayIndex]
        } else {
            teamsTextView.text = "Invalid day selected"
        }
    }
}

class AnotherActivity {

}
