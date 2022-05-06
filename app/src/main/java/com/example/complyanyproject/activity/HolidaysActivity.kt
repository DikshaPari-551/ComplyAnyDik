package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanyproject.R

class HolidaysActivity : AppCompatActivity() {

    lateinit var backAddHoliday: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holidays)

        backAddHoliday = findViewById(R.id.backAddHoliday)

        backAddHoliday.setOnClickListener {
            onBackPressed()
        }

    }
    override fun onBackPressed() {
        finish()
    }
}