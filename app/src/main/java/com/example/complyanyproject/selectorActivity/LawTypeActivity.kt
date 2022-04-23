package com.example.complyanyproject.selectorActivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.databinding.ActivityLawTypeBinding

class LawTypeActivity : AppCompatActivity() {


    private lateinit var binding : ActivityLawTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLawTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backLawType.setOnClickListener {
            onBackPressed()
        }

        binding.txt1.setOnClickListener {
            val text = binding.txt1.text.toString()
            val intent = Intent()
            intent.putExtra("lawType", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.txt2.setOnClickListener {
            val text = binding.txt2.text.toString()
            val intent = Intent()
            intent.putExtra("lawType", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        binding.txt3.setOnClickListener {
            val text = binding.txt3.text.toString()
            val intent = Intent()
            intent.putExtra("lawType", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        binding.txt4.setOnClickListener {
            val text = binding.txt4.text.toString()
            val intent = Intent()
            intent.putExtra("lawType", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        binding.txt5.setOnClickListener {
            val text = binding.txt5.text.toString()
            val intent = Intent()
            intent.putExtra("lawType", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}