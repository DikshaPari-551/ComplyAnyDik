package com.example.complyanyproject.activity

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateCalenderManagementBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity
import com.example.complyanyproject.selectorActivity.SelectorEntityActivity
import java.util.*

class CreateCalenderManagementActivity : AppCompatActivity() {

    var flag1 = false
    var flag2 = false
    var flag3 = false
    var flag4 = false
    var flag5 = false
    var flag6 = false
    var flag7 = false
    var flag8 = false
    var flag9 = false

    private lateinit var binding : ActivityCreateCalenderManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCalenderManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added clicks on back
        binding.backCalenderManagement.setOnClickListener {
            onBackPressed()
        }

        // added clicks on save
        binding.saveCalenderManagement.setOnClickListener {
            Toast.makeText(this, "saved...", Toast.LENGTH_LONG).show()
            finish()
        }

        //added clicks on select entity sub items
        binding.rlSelectCountries.setOnClickListener {
            Intent(this,CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectEntity.setOnClickListener {
            Intent(this,SelectorEntityActivity::class.java).also{
                startActivity(it)
            }
        }

        //added clicks on add holidays option
        binding.btnAddHoliday.setOnClickListener {
            Intent(this,HolidaysActivity::class.java).also{
                startActivity(it)
            }
        }

        // added drop down code
        val numbers = resources.getStringArray(R.array.numbers)
        val adapter = ArrayAdapter(this, R.layout.dropdown_list, numbers)
        binding.financialFromAutoComplete1.setAdapter(adapter)


        // added calender picker code
        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        binding.txtDate.text = "$date-${month + 1}-$year"

        binding.imgDate.setOnClickListener {

            val datePickerDialog = this?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        // added clicks on select entity options
        binding.rlSelectOuterEntity.setOnClickListener {

            if (flag1 == true) {
                binding.selectEntityDown.visibility = View.VISIBLE
                binding.selectEntityRight.visibility = View.GONE
                binding.llSelectEntity.visibility = View.GONE
                flag1 = false

            } else {
                binding.selectEntityDown.visibility = View.GONE
                binding.selectEntityRight.visibility = View.VISIBLE
                binding.llSelectEntity.visibility = View.VISIBLE
                flag1 = true
            }
        }

        // added clicks on Financial year options
        binding.rlFinancialYear.setOnClickListener {

            if (flag2 == true) {
                binding.financialYearDown.visibility = View.VISIBLE
                binding.financialYearRight.visibility = View.GONE
                binding.llFinanancialYear.visibility = View.GONE
                flag2 = false
            } else {
                binding.financialYearDown.visibility = View.GONE
                binding.financialYearRight.visibility = View.VISIBLE
                binding.llFinanancialYear.visibility = View.VISIBLE
                flag2 = true
            }
        }

        // added clicks on semi monthly options
        binding.rlSemiMonthly.setOnClickListener {

            if (flag3 == true) {
                binding.semiMonthlyDown.visibility = View.VISIBLE
                binding.semiMonthlyRight.visibility = View.GONE
                binding.llSemiMonthly.visibility = View.GONE
                flag3 = false
            } else {
                binding.semiMonthlyDown.visibility = View.GONE
                binding.semiMonthlyRight.visibility = View.VISIBLE
                binding.llSemiMonthly.visibility = View.VISIBLE
                flag3 = true
            }
        }

        // added clicks on Quarter options
        binding.rlQuarter.setOnClickListener {

            if (flag4 == true) {
                binding.quarterDown.visibility = View.VISIBLE
                binding.quarterRight.visibility = View.GONE
                binding.llQuarter.visibility = View.GONE
                flag4 = false
            } else {
                binding.quarterDown.visibility = View.GONE
                binding.quarterRight.visibility = View.VISIBLE
                binding.llQuarter.visibility = View.VISIBLE
                flag4 = true
            }
        }

        // added clicks on half yearly options
        binding.rlHalfYearly.setOnClickListener {

            if (flag5 == true) {
                binding.halfYearlyDown.visibility = View.VISIBLE
                binding.halfYearlyRight.visibility = View.GONE
                binding.llHalfYearly.visibility = View.GONE
                flag5 = false
            } else {
                binding.halfYearlyDown.visibility = View.GONE
                binding.halfYearlyRight.visibility = View.VISIBLE
                binding.llHalfYearly.visibility = View.VISIBLE
                flag5 = true
            }
        }

        // added clicks on weekly off options
        binding.rlWeeklyOff.setOnClickListener {

            if (flag6 == true) {
                binding.WeeklyOffDown.visibility = View.VISIBLE
                binding.WeeklyOffRight.visibility = View.GONE
                binding.llWeeklyOff.visibility = View.GONE
                flag6 = false
            } else {
                binding.WeeklyOffDown.visibility = View.GONE
                binding.WeeklyOffRight.visibility = View.VISIBLE
                binding.llWeeklyOff.visibility = View.VISIBLE
                flag6 = true
            }
        }

        // added clicks on government holidays options
        binding.rlGovernmentHoliday.setOnClickListener {

            if (flag7 == true) {
                binding.GovernmentHolidayDown.visibility = View.VISIBLE
                binding.GovernmentHolidayRight.visibility = View.GONE
                binding.llGovernmentHoliday.visibility = View.GONE
                flag7 = false
            } else {
                binding.GovernmentHolidayDown.visibility = View.GONE
                binding.GovernmentHolidayRight.visibility = View.VISIBLE
                binding.llGovernmentHoliday.visibility = View.VISIBLE
                flag7 = true
            }
        }

        // added clicks on compliance start date options
        binding.rlComplianceStartDate.setOnClickListener {

            if (flag8 == true) {
                binding.complianceStartDateDown.visibility = View.VISIBLE
                binding.complianceStartDateRight.visibility = View.GONE
                binding.llComplianceStartDate.visibility = View.GONE
                flag8 = false
            } else {
                binding.complianceStartDateDown.visibility = View.GONE
                binding.complianceStartDateRight.visibility = View.VISIBLE
                binding.llComplianceStartDate.visibility = View.VISIBLE
                flag8 = true
            }
        }

        // added clicks on Close period options
        binding.rlClosePeriod.setOnClickListener {

            if (flag9 == true) {
                binding.closePeriodDown.visibility = View.VISIBLE
                binding.closePeriodRight.visibility = View.GONE
                binding.llClosePeriod.visibility = View.GONE
                flag9 = false
            } else {
                binding.closePeriodDown.visibility = View.GONE
                binding.closePeriodRight.visibility = View.VISIBLE
                binding.llClosePeriod.visibility = View.VISIBLE
                flag9 = true
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}