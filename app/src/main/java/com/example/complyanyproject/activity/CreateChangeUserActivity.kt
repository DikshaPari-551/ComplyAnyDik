package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateChangeUserBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

class CreateChangeUserActivity : AppCompatActivity() {

    lateinit var binding : ActivityCreateChangeUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateChangeUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backCreateChangeUser.setOnClickListener {
            onBackPressed()
        }

        // added clicks on save button
        binding.saveCreateChangeUser.setOnClickListener {
            finish()
        }

        // added clicks on selector
        binding.rlSelectEntityNameCreateChangeUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        binding.rlSelectUsernameCreateChangeUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 2)
            }
        }

        binding.rlSelectDepartmentOfReplacedUserCreateChangeUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 3)
            }
        }

        binding.rlSelectReplacedUserNameCreateChangeUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 4)
            }
        }




    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // added text in Create Change User
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEntityNameCreateChangeUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                binding.txtUserNameCreateChangeUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 3){
            if (resultCode == Activity.RESULT_OK){
                binding.txtDepartmentOfReplacedUserCreateChangeUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 4){
            if (resultCode == Activity.RESULT_OK){
                binding.txtReplacedUserNameCreateChangeUser.text = data?.getStringExtra("hello")
            }
        }

    }
}