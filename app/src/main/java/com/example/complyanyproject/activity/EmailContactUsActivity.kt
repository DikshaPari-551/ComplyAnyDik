package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R

class EmailContactUsActivity : AppCompatActivity() {

    lateinit var etUserName: EditText
    lateinit var etEmail: EditText
    lateinit var etSubject: EditText
    lateinit var etMessage: EditText
    lateinit var backEmailContact: TextView
    lateinit var SubmitBtnEmail: Button
    lateinit var userNameEmail_error: TextView
    lateinit var emailEmail_error: TextView
    lateinit var subjectEmail_error: TextView
    lateinit var messageEmail_error: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_contact_us)

        etUserName = findViewById(R.id.etUserName)
        etEmail = findViewById(R.id.etEmail)
        etSubject = findViewById(R.id.etSubject)
        etMessage = findViewById(R.id.etMessage)
        backEmailContact = findViewById(R.id.backEmailContact)
        SubmitBtnEmail = findViewById(R.id.SubmitBtnEmail)
        userNameEmail_error = findViewById(R.id.userNameEmail_error)
        emailEmail_error = findViewById(R.id.emailEmail_error)
        subjectEmail_error = findViewById(R.id.subjectEmail_error)
        messageEmail_error = findViewById(R.id.messageEmail_error)


        SubmitBtnEmail.setOnClickListener {

            val userName = etUserName.text.toString().trim()
            val subject = etSubject.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val msg = etMessage.text.toString().trim()


            if (userName.isEmpty()) {
                userNameEmail_error.text = "Username is required"

            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                userNameEmail_error.text = ""
                emailEmail_error.text = "email is invalid"

            } else if (subject.isEmpty()) {
                emailEmail_error.text = ""
                userNameEmail_error.text = ""
                subjectEmail_error.text = "Subject is required"

            } else if (msg.isEmpty()) {
                subjectEmail_error.text = ""
                emailEmail_error.text = ""
                userNameEmail_error.text = ""
                messageEmail_error.text = "Message is required"
            } else {
                messageEmail_error.text = ""
                subjectEmail_error.text = ""
                emailEmail_error.text = ""
                userNameEmail_error.text = ""
                Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()

                finish()
            }
        }

        backEmailContact.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }

}