package com.example.complyanyproject.activity

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCountryCompanyBinding
import com.example.complyanyproject.databinding.ActivityEntityBinding

class EntityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEntityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backEntity.setOnClickListener {
            onBackPressed()
        }

        binding.addIconEntity.setOnClickListener {
            Toast.makeText(this, "work in progress..", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
