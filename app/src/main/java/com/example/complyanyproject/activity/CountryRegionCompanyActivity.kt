package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCountryRegionCompanyBinding

class CountryRegionCompanyActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCountryRegionCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryRegionCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backCountryRegionCompany.setOnClickListener {
            onBackPressed()
        }

        binding.addIconCountryRegionCompany.setOnClickListener {
            Toast.makeText(this, "clicked add button..", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}