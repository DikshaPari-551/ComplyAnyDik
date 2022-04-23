package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityGlobalCompanyBinding
import com.example.complyanyproject.databinding.ActivitySubRegionalCompanyBinding

class SubRegionalCompanyActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySubRegionalCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubRegionalCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backSubRegionalCompany.setOnClickListener {
            onBackPressed()
        }

        binding.addIconSubRegionalCompany.setOnClickListener {
            Toast.makeText(this, "work in progress..", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}