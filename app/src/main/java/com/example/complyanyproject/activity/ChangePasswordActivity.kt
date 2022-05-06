package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

        // validations
        binding.btnUpdate.setOnClickListener {
            val oldPass = binding.etOldPass.text.toString().trim()
            val newPass = binding.etNewPass.text.toString().trim()
            val confirmPass = binding.etConfirmNewPass.text.toString().trim()

            val checkPass = "^" +
                    "(?=.*[0-9])" +   // at least 1 digit
                    "(?=.*[a-zA-Z])" +   // any letter
                    "(?=.*[@#$%^&+=])" +  // at least 1 spacial character
                    "(?=\\S+$)" +    // no white space
                    ".{8,}" +        // at least 8 character
                    "$"

            if (oldPass.isEmpty()){
                binding.txtOldPassword.visibility = View.VISIBLE
                binding.txtOldPassword.text = "*Please enter old password"
            }
            else if (newPass.isEmpty()){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.visibility = View.VISIBLE
                binding.txtNewPassword.text = "*Please enter new password"
                binding.etNewPass.requestFocus()
            }
            else if (oldPass == newPass){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.text = "*New password must me different"
                binding.etOldPass.requestFocus()
            }
            else if(newPass.length < 8){
                binding.txtOldPassword.visibility = View.GONE
                binding.etNewPass.requestFocus()
            }
            else if (!newPass.matches(checkPass.toRegex())){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.text = "*Password should have minimum 8 characters, atleast 1 uppercase letter,1 lowercase letter,1 number and 1 special character."
                binding.etNewPass.requestFocus()
            }
            else if(confirmPass.isEmpty()){
                binding.txtNewPassword.visibility = View.GONE
                binding.txtConfirmNewPassword.visibility = View.VISIBLE
                binding.txtConfirmNewPassword.text = "*Please enter confirm password"
                binding.etConfirmNewPass.requestFocus()
            }
            else if (confirmPass != newPass){
                binding.txtNewPassword.visibility = View.GONE
                binding.txtConfirmNewPassword.visibility = View.VISIBLE
                binding.txtConfirmNewPassword.text = "*New password and confirm new password should match. "
                binding.etConfirmNewPass.requestFocus()
            }
            else{
                // hide tv textViews
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.visibility = View.GONE
                binding.txtConfirmNewPassword.visibility = View.GONE

                // empty tv texts
                binding.txtOldPassword.text = ""
                binding.txtNewPassword.text = ""
                binding.txtConfirmNewPassword.text = ""

                // remove texts from edit text
                binding.etOldPass.text.clear()
                binding.etNewPass.text.clear()
                binding.etConfirmNewPass.text.clear()

                Toast.makeText(this, "Password Updated...", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}