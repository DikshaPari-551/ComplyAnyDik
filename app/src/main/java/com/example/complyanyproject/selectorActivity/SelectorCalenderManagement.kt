package com.example.complyanyproject.selectorActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanyproject.R

class SelectorCalenderManagement : AppCompatActivity() {

    lateinit var backSelectorCalenderManagement : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selector_calender_management)

        backSelectorCalenderManagement = findViewById(R.id.backSelectorCalenderManagement)

        backSelectorCalenderManagement.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}