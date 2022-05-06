package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateUserBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

class CreateUserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreateUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backCreateUser.setOnClickListener {
            onBackPressed()
        }

        // added click save button
        binding.saveCreateUser.setOnClickListener {
            finish()
        }

        // added clicks on selector options

        binding.rlSelectGlobalCompanyCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        binding.rlSelectGlobalRegionCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 2)
            }
        }

        binding.rlSelectGlobalSubRegionCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 3)
            }
        }

        binding.rlSelectCountryOfficeCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 4)
            }
        }

        binding.rlSelectCountryRegionOfficeCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 5)
            }
        }

       /* binding.rlSelectEntityCreateUser.setOnClickListener {
            Intent(this, EntityActivity::class.java).also{
                startActivityForResult(it, 6)
            }
        }

        binding.rlSelectDepartmentCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 7)
            }
        }

        binding.rlSelectSubDepartmentCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 8)
            }
        }
*/
      /*  binding.rlSelectUserRoleCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 9)
            }
        }

        binding.rlSelectManagerCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 10)
            }
        }

        binding.rlSelectEscalationManagerCreateUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 11)
            }
        }*/
    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // added text in Create User
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalCompanyCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalRegionCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 3){
            if (resultCode == Activity.RESULT_OK){
                binding.txtGlobalSubRegionCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 4){
            if (resultCode == Activity.RESULT_OK){
                binding.txtCountryOfficeCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 5){
            if (resultCode == Activity.RESULT_OK){
                binding.txtCountryRegionOfficeCreateUser.text = data?.getStringExtra("hello")
            }
        }


        // added text in select law and user
     /*   if (requestCode == 6){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEntityNameCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 7){
            if (resultCode == Activity.RESULT_OK){
                binding.txtDepartmentCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 8){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSubDepartmentCreateUser.text = data?.getStringExtra("hello")
            }
        }
*/
/*
        if (requestCode == 9){
            if (resultCode == Activity.RESULT_OK){
                binding.txtUserRoleCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 10){
            if (resultCode == Activity.RESULT_OK){
                binding.txtManagerCreateUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 11){
            if (resultCode == Activity.RESULT_OK){
                binding.txtEscalaionManagerCreateUser.text = data?.getStringExtra("hello")
            }
        }
*/

    }

}