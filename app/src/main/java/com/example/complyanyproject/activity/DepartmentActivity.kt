package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.complyanyproject.databinding.ActivityDepartmentBinding

class DepartmentActivity : AppCompatActivity() {


    private lateinit var binding : ActivityDepartmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backDepartment.setOnClickListener {
            onBackPressed()
        }

        // added delete method
        binding.imgLegalDepartmentDelete.setOnClickListener{
            binding.cvLegalDepartment.visibility =View.GONE
        }

    }

    override fun onBackPressed() {
        finish()
    }
}
