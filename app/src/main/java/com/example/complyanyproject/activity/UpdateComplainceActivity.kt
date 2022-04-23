package com.example.complyanyproject.activity

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityUpdateComplainceBinding
import java.util.*

class UpdateComplainceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUpdateComplainceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateComplainceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backUpdateComplaince.setOnClickListener {
            finish()
        }

        // added calender code
        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        binding.txtFromText.text = "$date-${month + 1}-$year"

        binding.txtToDate.text = "$date-${month + 1}-$year"

        binding.imgFromDate.setOnClickListener {

            val datePickerDialog = this.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtFromText.text = "$dayOfMonth-${monthOfYear + 1}-$year"

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
}