package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivitySubLawOrSubHeadBinding

class SubLawOrSubHeadActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySubLawOrSubHeadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubLawOrSubHeadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backSubLawOrSubHead.setOnClickListener {
            onBackPressed()
        }

        binding.addIconSubLawOrSubHead.setOnClickListener {
            Toast.makeText(this, "work in progress", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}