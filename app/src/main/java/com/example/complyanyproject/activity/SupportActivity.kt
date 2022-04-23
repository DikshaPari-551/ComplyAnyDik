package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivitySupportBinding

class SupportActivity : AppCompatActivity() {

    lateinit var textview1: TextView
    lateinit var textview2: TextView
    lateinit var textview3: TextView
    lateinit var email_et: EditText
    lateinit var mobile_et: EditText
    lateinit var message_et: EditText
    lateinit var backSupport: TextView
    lateinit var support_btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)

        email_et= findViewById(R.id.email_ET)
        mobile_et= findViewById(R.id.mobile_ET)
        message_et= findViewById(R.id.message_ET)

        textview1= findViewById(R.id.textview1)
        textview2= findViewById(R.id.textview2)
        textview3= findViewById(R.id.textview3)

        support_btn= findViewById(R.id.support_btn)
        backSupport= findViewById(R.id.backSupport)

        backSupport.setOnClickListener {
            finish()
        }

        // Adding scrollable behaviour in enter message edittext
        message_et.setOnTouchListener(View.OnTouchListener { v, event ->
            if (message_et.hasFocus()) {
                v.parent.requestDisallowInterceptTouchEvent(true)
                when (event.action and MotionEvent.ACTION_MASK) {
                    MotionEvent.ACTION_SCROLL -> {
                        v.parent.requestDisallowInterceptTouchEvent(false)
                        return@OnTouchListener true
                    }
                }
            }
            false
        })

        support_btn.setOnClickListener {

            val email = email_et.text.toString()
            val mobile =  mobile_et.text.toString()
            val msg = message_et.text.toString()

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                textview1.text = "Enter Valid Email Address"
            }
            else if (mobile.length < 10) {
                textview3.text = ""
                textview1.text = ""
                textview2.text = "Mobile number is invalid"
            }
            else if (msg.isEmpty()){
                textview1.text = ""
                textview2.text = ""
                textview3.text= "This field is required*"
            }
            else{
                email_et.text.clear()
                mobile_et.text.clear()
                message_et.text.clear()
                textview1.text = ""
                textview2.text = ""
                textview3.text=""
                finish()
            }
        }


    }

}