package com.example.complyanyproject.activity

import android.app.DatePickerDialog
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.OverDueAdapter
import com.example.complyanyproject.model.OverdueModelClass
import java.util.*
import kotlin.collections.ArrayList

class OverDueActivity : AppCompatActivity() {

    lateinit var recyclerView1: RecyclerView
    lateinit var adapter : OverDueAdapter
    lateinit var et_date:TextView

    lateinit var overDueBackIcon : TextView

    var array: ArrayList<OverdueModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_due)

        recyclerView1 = findViewById(R.id.recylerviewOverdue)
        overDueBackIcon = findViewById(R.id.overDueBackIcon)
//        et_date = findViewById(R.id.etCalender)

        var data1 = OverdueModelClass(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            "",
            ""
        )
        var data2 = OverdueModelClass(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            "",
            ""
        )
        var data3 = OverdueModelClass(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            "",
            ""
        )
        var data4 = OverdueModelClass(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            "",
            ""
        )
        var data5 = OverdueModelClass(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            "",
            ""
        )
        var data6 = OverdueModelClass(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            "",
            ""
        )

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)


        // this creates a vertical layout Manager
        recyclerView1.layoutManager = LinearLayoutManager(this)
        // This will pass the ArrayList to our Adapter
        adapter = OverDueAdapter(this, array)

        // Setting the Adapter with the recyclerview
        recyclerView1.adapter = adapter


//        val myCalendar = Calendar.getInstance()
//        var day = myCalendar.get(Calendar.DAY_OF_MONTH)
//        var year = myCalendar.get(Calendar.YEAR)
//        var month = myCalendar.get(Calendar.MONTH)
//
//        et_date.setOnClickListener {
//
//            et_date.setTextColor(Color.parseColor("#000000"))
//
//            var datePicker = DatePickerDialog(this, R.style.DatePickerTheme,
//                { view, year, month, dayOfMonth -> // adding the selected date in the edittext
//                    et_date.setText(dayOfMonth.toString() + "/" + (month + 1) + "/" + year)
//                }, year, month, day
//
//            )
//            datePicker!!.getDatePicker().setMinDate(myCalendar.getTimeInMillis())
//
//            // show the dialog
//            datePicker!!.show()
//
//
//        }

        // added clicks on back button
        overDueBackIcon.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}