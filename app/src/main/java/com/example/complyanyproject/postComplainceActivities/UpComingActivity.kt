package com.example.complyanyproject.postComplainceActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.UpComingAdapter
import com.example.complyanyproject.model.UpComingModelClass

class UpComingActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: UpComingAdapter
    lateinit var backUpComing: TextView

    var array: ArrayList<UpComingModelClass> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_up_coming)

        recyclerView = findViewById(R.id.recyclerViewUpcoming)
        backUpComing = findViewById(R.id.backUpComing)


        // added back method
        backUpComing.setOnClickListener {
            onBackPressed()
        }

        var data1 = UpComingModelClass(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data2 = UpComingModelClass(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data3 = UpComingModelClass(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data4 = UpComingModelClass(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data5 = UpComingModelClass(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data6 = UpComingModelClass(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data7 = UpComingModelClass(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data8 = UpComingModelClass(
            "IN-GSDN2SYR",
            "harry-monthly",
            "Payment",
            "April-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data9 = UpComingModelClass(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )
        var data10 = UpComingModelClass(
            "IN-CW87YBYO",
            "Timetakend",
            "Meeting",
            "April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data11 = UpComingModelClass(
            "IN-VNVJY3Z1",
            "upgrade plan2",
            "Meeting",
            "June-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data12 = UpComingModelClass(
            "IN-DFIXP7D",
            "upgrade plan2",
            "Return",
            "Jun-2021",
            "2021-06-10T00:00:00.000Z",
            ""
        )
        var data13 = UpComingModelClass(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data14 = UpComingModelClass(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data15 = UpComingModelClass(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data16 = UpComingModelClass(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data17 = UpComingModelClass(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data18 = UpComingModelClass(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data19 = UpComingModelClass(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )

        var data20 = UpComingModelClass(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)
        array.add(data7)
        array.add(data8)
        array.add(data9)
        array.add(data10)
        array.add(data11)
        array.add(data12)
        array.add(data13)
        array.add(data14)
        array.add(data15)
        array.add(data16)
        array.add(data17)
        array.add(data18)
        array.add(data19)
        array.add(data20)


        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // This will pass the ArrayList to our Adapter
        adapter = UpComingAdapter(this, array)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }

    override fun onBackPressed() {
        finish()
    }
}