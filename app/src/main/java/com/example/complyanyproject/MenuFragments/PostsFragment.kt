package com.example.complyanyproject.MenuFragments

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.OverDueActivity
import com.example.complyanyproject.postComplainceActivities.CompletedActivity
import com.example.complyanyproject.postComplainceActivities.ThisMonthActivity
import com.example.complyanyproject.postComplainceActivities.TodayActivity
import com.example.complyanyproject.postComplainceActivities.UpComingActivity
import java.util.*

class PostsFragment : Fragment() {

    lateinit var FromdateTextView: TextView
    lateinit var TodateTextView: TextView

    lateinit var FromdateImageView:RelativeLayout
    lateinit var TodateImageView:RelativeLayout

    lateinit var overDueLayout: TextView
    lateinit var todayLayout : TextView
    lateinit var thisMonthLayout : TextView
    lateinit var upcomingLayout: TextView
    lateinit var completedLayout : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_posts, container, false)
        overDueLayout = view.findViewById(R.id.overDue)
        todayLayout = view.findViewById(R.id.today)
        thisMonthLayout = view.findViewById(R.id.thisMonth)
        upcomingLayout = view.findViewById(R.id.upcoming)
        completedLayout = view.findViewById(R.id.completed)


        // added clicks on list items
        overDueLayout.setOnClickListener {
            val intent = Intent(context, OverDueActivity::class.java)
            startActivity(intent)
        }


        todayLayout.setOnClickListener {
            val intent = Intent(context, TodayActivity::class.java)
            startActivity(intent)
        }

        thisMonthLayout.setOnClickListener {
            val intent = Intent(context, ThisMonthActivity::class.java)
            startActivity(intent)
        }

        upcomingLayout.setOnClickListener {
            val intent = Intent(context, UpComingActivity::class.java)
            startActivity(intent)
        }

        completedLayout.setOnClickListener {
            val intent = Intent(context, CompletedActivity::class.java)
            startActivity(intent)
        }


        // added calender code
        FromdateTextView = view.findViewById(R.id.from_date_Text)
        TodateTextView = view.findViewById(R.id.to_date_Text)



        FromdateImageView = view.findViewById(R.id.from_date_ImageView)
        TodateImageView = view.findViewById(R.id.to_date_ImageView)

/*
       val calendar: Calendar = Calendar.getInstance()
      val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
       val date = calendar.get(Calendar.DAY_OF_MONTH)

        FromdateTextView.text = "$date-${month + 1}-$year"

        TodateTextView.text = "$date-${month + 1}-$year"

        FromdateImageView.setOnClickListener {

            val datePickerDialog = activity?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        FromdateTextView.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }*/


        val myCalendar = Calendar.getInstance()
        var day = myCalendar.get(Calendar.DAY_OF_MONTH)
        var year = myCalendar.get(Calendar.YEAR)
        var month = myCalendar.get(Calendar.MONTH)
     //   FromdateTextView.setTextColor(Color.parseColor("#000000"))

     //  var datePicker = DatePickerDialog(activity as Context)

        FromdateImageView.setOnClickListener {

            FromdateTextView.setTextColor(Color.parseColor("#000000"))

            var datePicker = DatePickerDialog(activity as Context, R.style.DatePickerTheme,
                { view, year, month, dayOfMonth -> // adding the selected date in the edittext
                    FromdateTextView.setText(dayOfMonth.toString() + "/" + (month + 1) + "/" + year)
                }, year, month, day

            )
            datePicker!!.getDatePicker().setMinDate(myCalendar.getTimeInMillis())

            // show the dialog
            datePicker!!.show()


        }


        TodateImageView.setOnClickListener {

            TodateTextView.setTextColor(Color.parseColor("#000000"))

            var datePicker = DatePickerDialog(activity as Context, R.style.DatePickerTheme,
                { view, year, month, dayOfMonth -> // adding the selected date in the edittext
                    TodateTextView.setText(dayOfMonth.toString() + "/" + (month + 1) + "/" + year)
                }, year, month, day

            )
            datePicker!!.getDatePicker().setMinDate(myCalendar.getTimeInMillis())

            // show the dialog
            datePicker!!.show()


        }

/*
        TodateImageView.setOnClickListener {

            val datePickerDialog = activity?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        TodateTextView.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }*/

        return view
    }


}