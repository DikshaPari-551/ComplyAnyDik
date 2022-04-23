package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanyproject.R

class HelpDocumentActivity : AppCompatActivity() {

    lateinit var backHelpDocument : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_document)

        backHelpDocument = findViewById(R.id.backHelpDocument)

        backHelpDocument.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}