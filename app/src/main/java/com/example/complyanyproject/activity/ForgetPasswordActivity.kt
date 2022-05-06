package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
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
                binding.txtCustomerCode.visibility = View.VISIBLE
                binding.txtCustomerCode.text = "*Please enter customer code"
                binding.etCustomerCode.requestFocus()
            }
            else if(customerCode.length < 8){
                binding.txtCustomerCode.visibility = View.VISIBLE
                binding.txtCustomerCode.text = "*Customer code must contain atleast 8 characters"
                binding.etCustomerCode.requestFocus()

            }
            else if(email.isEmpty()){
                binding.txtCustomerCode.visibility = View.GONE
                binding.txtEmailForgot.visibility = View.VISIBLE
                binding.txtEmailForgot.text = "*Please enter email address"
                binding.etEmail.requestFocus()
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.txtCustomerCode.visibility = View.GONE
                binding.txtEmailForgot.visibility = View.VISIBLE
                binding.txtEmailForgot.text = "*Please enter valid email address"
                binding.etEmail.requestFocus()

            }
            else{
                binding.txtCustomerCode.visibility = View.GONE
                binding.txtEmailForgot.visibility = View.GONE

                binding.txtCustomerCode.text = ""
                binding.txtEmailForgot.text = ""

                binding.etCustomerCode.text.clear()
                binding.etEmail.text.clear()

                Toast.makeText(this, "Submitted...", Toast.LENGTH_SHORT).show()

                finish()
            }
        }

/*
        binding.btnSubmitted.setOnClickListener {
            val customerCode = binding.etCustomerCode.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()

            if(customerCode.isEmpty()){
                binding.txtCustomerCode.visibility = View.VISIBLE
                binding.txtCustomerCode.text = "*PlRequired"
            }
            else if(customerCode.length < 8){
                binding.txtCustomerCode.visibility = View.VISIBLE
                binding.txtCustomerCode.text = "Customer code contains atleast 8 characters"
            }
            else if(email.isEmpty()){
                binding.txtCustomerCode.visibility = View.GONE
                binding.txtEmailForgot.visibility = View.VISIBLE
                binding.txtEmailForgot.text = "Required"
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.txtCustomerCode.visibility = View.GONE
                binding.txtEmailForgot.visibility = View.VISIBLE
                binding.txtEmailForgot.text = "Enter valid email address"
            }
            else{
                binding.txtCustomerCode.visibility = View.GONE
                binding.txtEmailForgot.visibility = View.GONE

                binding.txtCustomerCode.text = ""
                binding.txtEmailForgot.text = ""

                binding.etCustomerCode.text.clear()
                binding.etEmail.text.clear()

                Toast.makeText(this, "Submitted...", Toast.LENGTH_SHORT).show()
            }
        }
*/

    }

    override fun onBackPressed() {
        finish()
    }
}