package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.complyanyproject.databinding.ActivityForgetPasswordBinding
import java.util.regex.Pattern

class ForgetPasswordActivity : AppCompatActivity() {


    private lateinit var binding : ActivityForgetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

        binding.btnSubmitted.setOnClickListener {
            val customerCode = binding.etCustomerCode.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()

            if(customerCode.isEmpty()){
                binding.etCustomerCode.setError("customer code atleast 8 digits")
            }
            else if(customerCode.length < 8){
                binding.etCustomerCode.setError("Enter valid customer code")
            }
            else if(email.isEmpty()){
                binding.etEmail.setError("Please enter email address")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.etEmail.setError("Enter valid email address")
            }
            else{
                binding.etCustomerCode.text.clear()
                binding.etEmail.text.clear()

                Toast.makeText(this, "Submitted...", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}