package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.complyanyproject.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.profileLayout.setOnClickListener {
            Intent(this, ProfileActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.changePasswordLayout.setOnClickListener {
            Intent(this, ChangePasswordActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.resourseManagementLayout.setOnClickListener {
            Intent(this, ResourceManagementActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.toolbarBackIcon.setOnClickListener {
            finish()
        }


    }

    override fun onBackPressed() {
        finish()
    }

}