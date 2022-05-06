package com.example.complyanyproject.adapter

import android.app.DatePickerDialog
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.CompletedModelClass
import java.util.*
import kotlin.collections.ArrayList

class CompletedAdapter (var context: Context, var data: ArrayList<CompletedModelClass>) : RecyclerView.Adapter<CompletedAdapter.CompletedViewHolder>() {

    class CompletedViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val complyCode = view.findViewById<TextView>(R.id.com_code_tx)
        val complain = view.findViewById<TextView>(R.id.complaince_tx)
        val nature = view.findViewById<TextView>(R.id.nature_tx)
        val period = view.findViewById<TextView>(R.id.period_tx)
        val dueDate = view.findViewById<TextView>(R.id.dueDate_tx)
            val calender=view.findViewById<TextView>(R.id.etCalender)

        val remarks = view.findViewById<EditText>(R.id.remarks_tx)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompletedViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.completed_recycler_layout, parent, false)
        return CompletedViewHolder(view)
    }

    override fun onBindViewHolder(holder: CompletedViewHolder, position: Int) {
        val userData = data[position]

        holder.complyCode.text = userData.complyCode
        holder.complain.text = userData.complain
        holder.nature.text = userData.nature
        holder.period.text = userData.period
        holder.dueDate.text = userData.dueDate
        holder.calender.text=userData.calender
        holder.remarks.setText(userData.remarks)

            val myCalendar = Calendar.getInstance()
        var day = myCalendar.get(Calendar.DAY_OF_MONTH)
        var year = myCalendar.get(Calendar.YEAR)
        var month = myCalendar.get(Calendar.MONTH)

        holder.calender.setOnClickListener {

            holder.calender.setTextColor(Color.parseColor("#000000"))

            var datePicker = DatePickerDialog(context, R.style.DatePickerTheme,
                { view, year, month, dayOfMonth -> // adding the selected date in the edittext
                    holder.calender.setText(dayOfMonth.toString() + "/" + (month + 1) + "/" + year)
                }, year, month, day

            )
            datePicker!!.getDatePicker().setMinDate(myCalendar.getTimeInMillis())

            // show the dialog
            datePicker!!.show()


        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}