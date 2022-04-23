package com.example.complyanyproject.selectorActivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCompanySelectorBinding
import com.example.complyanyproject.databinding.ActivityLawNatureBinding

class LawNatureActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLawNatureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLawNatureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backLawNature.setOnClickListener {
            onBackPressed()
        }

        binding.txt1.setOnClickListener {
            val text = binding.txt1.text.toString()
            val intent = Intent()
            intent.putExtra("lawNature", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.txt2.setOnClickListener {
            val text = binding.txt2.text.toString()
            val intent = Intent()
            intent.putExtra("lawNature", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        binding.txt3.setOnClickListener {
            val text = binding.txt3.text.toString()
            val intent = Intent()
            intent.putExtra("lawNature", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}