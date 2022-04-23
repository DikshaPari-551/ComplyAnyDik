package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.OverDueAdapter
import com.example.complyanyproject.model.OverdueModelClass

class OverDueActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter : OverDueAdapter

    lateinit var overDueBackIcon : TextView

    var array: ArrayList<OverdueModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_due)

        recyclerView = findViewById(R.id.recylerviewOverdue)
        overDueBackIcon = findViewById(R.id.overDueBackIcon)

        var data1 = OverdueModelClass(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data2 = OverdueModelClass(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data3 = OverdueModelClass(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data4 = OverdueModelClass(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data5 = OverdueModelClass(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data6 = OverdueModelClass(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)


        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // This will pass the ArrayList to our Adapter
        adapter = OverDueAdapter(this, array)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter


        // added clicks on back button
        overDueBackIcon.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}