package com.example.complyanyproject.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ViewPagerAdapter
import com.example.complyanyproject.databinding.ActivityLoginBinding
import com.example.complyanyproject.fragment.BusinessPartnerFragment
import com.example.complyanyproject.fragment.UserFragment

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupTabs()
//        changeColorTextView()

        binding.txtSupport.setOnClickListener {
            Intent(this, SupportActivity::class.java).also{
                startActivity(it)
            }
        }
    }

    private fun setupTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.getFragment(UserFragment(), "User")
        adapter.getFragment(BusinessPartnerFragment(), "Business Partner")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }


    override fun onBackPressed() {
        finish()
    }


}