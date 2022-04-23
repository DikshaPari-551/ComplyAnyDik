package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.UpComingModelClass

class UpComingAdapter(var context: Context, var data:ArrayList<UpComingModelClass>): RecyclerView.Adapter<UpComingAdapter.UpComingViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpComingViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.upcoming_recycler_layout, parent, false)
        return UpComingViewHolder(view)
    }

    override fun onBindViewHolder(holder: UpComingViewHolder, position: Int) {
        val userData = data[position]

        holder.complyCode.text = userData.complyCode
        holder.complain.text = userData.complain
        holder.nature.text = userData.nature
        holder.period.text = userData.period
        holder.dueDate.text = userData.dueDate
        holder.remarks.setText(userData.remarks)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class UpComingViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val complyCode = view.findViewById<TextView>(R.id.com_code_tx)
        val complain = view.findViewById<TextView>(R.id.complaince_tx)
        val nature = view.findViewById<TextView>(R.id.nature_tx)
        val period = view.findViewById<TextView>(R.id.period_tx)
        val dueDate = view.findViewById<TextView>(R.id.dueDate_tx)
        val remarks = view.findViewById<EditText>(R.id.remarks_tx)

    }

}