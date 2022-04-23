package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityGlobalCompanyBinding

class GlobalCompanyActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGlobalCompanyBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlobalCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backGlobalCompany.setOnClickListener {
            onBackPressed()
        }

        binding.addIconGlobalCompany.setOnClickListener {
            Toast.makeText(this, "work in progress...", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}