package com.example.complyanyproject.activity

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateChangeUserBinding
import com.example.complyanyproject.databinding.ActivityCreateProxyUserBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity
import java.util.*

class CreateProxyUserActivity : AppCompatActivity() {

    lateinit var binding : ActivityCreateProxyUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateProxyUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backCreateProxyUser.setOnClickListener {
            onBackPressed()
        }

        // added clicks on save button
        binding.saveCreateProxyUser.setOnClickListener {
            finish()
        }

        // added clicks on selector
        binding.rlSelectEntityNameCreateProxyUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        binding.rlSelectUsernameCreateProxyUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 2)
            }
        }

        binding.rlSelectDepartmentOfProxyUserCreateChangeUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 3)
            }
        }

        binding.rlSelectProxyNameCreateProxyUser.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 4)
            }
        }


        // added calender picker code

        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        binding.txtFromDate.text = "$date-${month + 1}-$year"

        binding.txtToDate.text = "$date-${month + 1}-$year"

        binding.imgFromDate.setOnClickListener {

            val datePickerDialog = this.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtFromDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        binding.imgToDate.setOnClickListener {

            val datePickerDialog = this.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtToDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
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
                binding.txtEntityNameCreateProxyUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                binding.txtUserNameCreateProxyUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 3){
            if (resultCode == Activity.RESULT_OK){
                binding.txtDepartmentOfProxyUserCreateProxyUser.text = data?.getStringExtra("hello")
            }
        }

        if (requestCode == 4){
            if (resultCode == Activity.RESULT_OK){
                binding.txtProxyNameCreateProxyUser.text = data?.getStringExtra("hello")
            }
        }

    }
}