package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanyproject.R

class HelpContactActivity : AppCompatActivity() {

    lateinit var ChatContact: TextView
    lateinit var EmailContact: TextView
    lateinit var BookameetingContact: TextView
    lateinit var backHelpContact:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_contact)

        ChatContact= findViewById(R.id.ChatContact)
        EmailContact= findViewById(R.id.EmailContact)
        BookameetingContact= findViewById(R.id.BookameetingContact)
        backHelpContact = findViewById(R.id.backHelpContact)



        EmailContact.setOnClickListener{

            Intent(this, EmailContactUsActivity::class.java).also {
                startActivity(it)
            }
        }


        backHelpContact.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}