package com.example.complyanyproject.fragment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.ForgetPasswordActivity
import com.example.complyanyproject.activity.MainActivity
import com.example.complyanyproject.activity.TermsAndConditionsActivity
import com.example.complyanyproject.databinding.FragmentUserBinding

lateinit var sharedPreferences: SharedPreferences

class UserFragment : Fragment() {


    private var _binding: FragmentUserBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        val view = binding.root

        sharedPreferences = this.requireActivity().getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)


            // added clicks on terms
            binding.txtTermsOfUse.setOnClickListener {
                Intent(activity as Context, TermsAndConditionsActivity::class.java).also{
                    startActivity(it)
                }
            }
            // added clicks on continue
/*
            binding.btnLogin.setOnClickListener {

                val phoneNumber = binding.etPhone.text.toString().trim()
                val email = binding.etEmail.text.toString().trim()
                    val pass = binding.etPass.text.toString().trim()


                if(phoneNumber.isEmpty()){
                    binding.txtPhone.visibility = View.VISIBLE
                    binding.txtPhone.text = "*Please enter phone number"
                    binding.txtEmail.text=""
                    binding.txtPassword.text=""

                }
                else if (phoneNumber.length !=10) {
                    binding.txtPhone.visibility = View.VISIBLE
                    binding.txtPhone.text = "*Please enter valid number"
                   // binding.txtPhone.text = ""
                    binding.txtEmail.text=""
                    binding.txtPassword.text=""

                } else if (email.isEmpty()) {


                    binding.txtEmail.visibility = View.VISIBLE
                    binding.txtEmail.text = "*"
                    binding.txtPhone.text = ""
//                    binding.txtPassword.text=""
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                    binding.txtPhone.text = ""
                    binding.txtEmail.text = "*Please enter valid email address"
                }else if(pass.length < 8){
                    binding.txtPassword.visibility = View.VISIBLE
                    binding.txtPassword.text = "*Password must contains atleast 8 characters"


                }

                else {

                    binding.txtPhone.visibility = View.GONE
                    binding.txtEmail.visibility = View.GONE
         //           binding.btnContinue.visibility = View.GONE
                    binding.etPass.visibility = View.VISIBLE
                    binding.txtPassword.text = ""
                    binding.txtPassword.visibility = View.GONE

                    sharedPreferences.edit().putString("userPhone", binding.etPhone.text.toString()).apply()
                    sharedPreferences.edit().putString("userEmail", binding.etEmail.text.toString()).apply()
                    sharedPreferences.edit().putString("userPass", binding.etPass.text.toString()).apply()
                    sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()

                    binding.etPhone.text.clear()
                    binding.etEmail.text.clear()
                    binding.etPass.text.clear()
                    Intent(context, MainActivity::class.java).also {
                        startActivity(it)
                        this.activity?.finish()
                    }

                }
            }
*/
        binding.btnLogin.setOnClickListener {

            val phoneNumber = binding.etPhone.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val pass = binding.etPass.text.toString().trim()

            if(phoneNumber.isEmpty()){
                binding.txtPhone.text = "*Please enter phone number"
                binding.txtEmail.text = ""
                binding.txtPassword.text = ""
                binding.etPhone.requestFocus()
            }
            else if (phoneNumber.length != 10) {
                binding.txtPhone.text = "*Phone number must contain 10 digits"
                binding.txtEmail.text = ""
                binding.txtPassword.text = ""
                binding.etPhone.requestFocus()
            }
            else if (email.isEmpty()) {
                binding.txtPhone.text = ""
                binding.txtEmail.text = "*Please enter email address"
                binding.txtPassword.text = ""
                binding.etEmail.requestFocus()
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.txtPhone.text = ""
                binding.txtEmail.text = "*Please enter valid email address"
                binding.txtPassword.text = ""
                binding.etEmail.requestFocus()

            }
            else if (pass.isEmpty()) {
                binding.txtPhone.text = ""
                binding.txtEmail.text = ""
                binding.txtPassword.text = "*Please enter your password"
                binding.etPass.requestFocus()
            }
            else if (pass.length < 8) {
                binding.txtPhone.text = ""
                binding.txtEmail.text = ""
                binding.txtPassword.text = "*Password must contains atleast 8 characters"
                binding.etPass.requestFocus()

            }
            else {
                binding.txtPhone.text = ""
                binding.txtEmail.text = ""
                binding.txtPassword.text = ""

                sharedPreferences.edit().putString("userPhone", binding.etPhone.text.toString()).apply()
                sharedPreferences.edit().putString("userEmail", binding.etEmail.text.toString()).apply()
                sharedPreferences.edit().putString("userPass", binding.etPass.text.toString()).apply()
                sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()

                binding.etPhone.text.clear()
                binding.etEmail.text.clear()
                binding.etPass.text.clear()

                Intent(context, MainActivity::class.java).also {
                    startActivity(it)
                    this.activity?.finish()
                }
            }
        }


            binding.txtForgotPassword.setOnClickListener {
                Intent(context, ForgetPasswordActivity::class.java).also {
                    startActivity(it)
                }
            }
            return view
        }


    override fun onStart() {
        super.onStart()

        if (sharedPreferences.getBoolean("isLoggedIn", false)){
            Intent(context, MainActivity::class.java).also {
                startActivity(it)
                this.activity?.finish()
            }
        }

    }

}