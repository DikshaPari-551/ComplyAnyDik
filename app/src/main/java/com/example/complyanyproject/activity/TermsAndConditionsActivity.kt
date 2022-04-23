package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanyproject.R

class TermsAndConditionsActivity : AppCompatActivity() {

    lateinit var backTermsAndConditions: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_conditions)

        backTermsAndConditions = findViewById(R.id.backTermsAndConditions)

        backTermsAndConditions.setOnClickListener {
            onBackPressed()
        }

    }
}