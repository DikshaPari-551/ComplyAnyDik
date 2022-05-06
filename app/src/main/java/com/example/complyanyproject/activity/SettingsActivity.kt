package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.databinding.ActivitySettingsBinding
import com.example.complyanyproject.settingsActivities.*
import com.example.complyanyproject.settingsActivities.SubscriptionSettingActivity

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back button method
        binding.backSettings.setOnClickListener {
            onBackPressed()
        }

        // added clicks on userRole
        binding.UserRoleLayout.setOnClickListener {
            Intent(this, UserRoleActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Entity type
        binding.entityTypeLayout.setOnClickListener {
            Intent(this, EntityTypeActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Industry type
        binding.industryTypeLayout.setOnClickListener {
            Intent(this, IndustryTypeActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Stock Exchange
        binding.StockExchangeLayout.setOnClickListener {
            Intent(this, StockExchangeActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Compliance Nature
        binding.complianceNatureLayout.setOnClickListener {
            Intent(this, ComplianceNatureActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Compliance Type
        binding.complianceTypeLayout.setOnClickListener {
            Intent(this, ComplianceTypeActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on backup
        binding.backupLayout.setOnClickListener {
            Intent(this, BackupActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on setting
        binding.SubscriptionLayout.setOnClickListener {
            Intent(this, SubscriptionSettingActivity::class.java).also{
                startActivity(it)
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}