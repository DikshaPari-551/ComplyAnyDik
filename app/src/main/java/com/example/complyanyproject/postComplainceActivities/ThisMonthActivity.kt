package com.example.complyanyproject.postComplainceActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanyproject.R

class ThisMonthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_this_month)

        val backThisMonth = findViewById<TextView>(R.id.backThisMonth)
        backThisMonth.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}