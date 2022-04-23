package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityListSubDepartmentBinding

class ListSubDepartmentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListSubDepartmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListSubDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.txt1.setOnClickListener {
            val intent = Intent()
            intent.putExtra("clientSubDepartment", binding.txt1.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.txt2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("clientSubDepartment", binding.txt2.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.txt3.setOnClickListener {
            val intent = Intent()
            intent.putExtra("clientSubDepartment", binding.txt3.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.backClientGroupName.setOnClickListener{
            onBackPressed()
        }


    }

    override fun onBackPressed() {
        finish()
    }

}