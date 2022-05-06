package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import android.hardware.biometrics.BiometricManager
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCalenderManagementBinding
import com.example.complyanyproject.selectorActivity.SelectorCalenderManagement

class CalenderManagementActivity : AppCompatActivity() {

    // Added uncesssary comment...

    private lateinit var binding: ActivityCalenderManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalenderManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added clicks on add button
        binding.addCalenderManagement.setOnClickListener {
            Intent(this, CreateCalenderManagementActivity::class.java).also{
                startActivity(it)
            }
        }


        // added click on select
        binding.rlCalenderManagement.setOnClickListener {
            Intent(this, SelectorCalenderManagement::class.java).also{
                startActivity(it)
            }
        }

        // added back method
        binding.backCalenderManagement.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == 1){
//            if (resultCode == Activity.RESULT_OK){
//                binding.txtCalenderManagement.text = data?.getStringExtra("calenderManagement")
//            }
//        }
//    }

}