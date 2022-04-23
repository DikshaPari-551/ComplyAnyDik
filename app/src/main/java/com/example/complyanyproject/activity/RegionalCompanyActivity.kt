package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityGlobalCompanyBinding
import com.example.complyanyproject.databinding.ActivityRegionalCompanyBinding

class RegionalCompanyActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegionalCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegionalCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backRegionalCompany.setOnClickListener {
            onBackPressed()
        }

        binding.addIconRegionalCompany.setOnClickListener {
            Toast.makeText(this, "work in progress..", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}