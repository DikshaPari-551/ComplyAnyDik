package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityTestingBinding

class TestingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTestingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val title = intent.getStringExtra("title")
        binding.tView.text = "Item value $title"

//        setSupportActionBar(binding.toolbar)
//        supportActionBar?.title = title

    }
}