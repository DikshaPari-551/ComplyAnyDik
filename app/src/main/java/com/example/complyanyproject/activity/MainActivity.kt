package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.view.View
import com.example.complyanyproject.MenuFragments.*
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        defaultMenuOpen()

        // set on click listeners on Bottom Nav Bar
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){

                R.id.dashboard -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, DashboardFragment())
                        .commit()
                }

                R.id.reports -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, ReportsFragment())
                        .commit()
                }

                R.id.post -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, PostsFragment())
                        .commit()
                }

                R.id.notify -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, NotificationsFragment())
                        .commit()
                }

                R.id.Menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, MenuFragment())
                        .commit()
                }

            }
            return@setOnItemSelectedListener true
        }

    }

    // navigating default screens
    private fun defaultMenuOpen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, DashboardFragment())
            .commit()
    }

}