package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.NotificationModelClass

class NotificationAdapter(var context: Context, var data: ArrayList<NotificationModelClass>) : RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        // Define click listener for the ViewHolder's View.
        var textCh1 = view.findViewById<TextView>(R.id.textCh1)
        var textCh2 = view.findViewById<TextView>(R.id.textCh2)
        var textCh3 = view.findViewById<TextView>(R.id.textCh3)
        var textCh4 = view.findViewById<TextView>(R.id.textCh4)
        var textCh5 = view.findViewById<TextView>(R.id.textCh5)
        var textCh6 = view.findViewById<TextView>(R.id.textCh6)
        var textCh7 = view.findViewById<TextView>(R.id.textCh7)
        var textCh8 = view.findViewById<TextView>(R.id.textCh8)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.notification_recycler_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userData = data[position]

        holder.textCh1.text = userData.textCh1
        holder.textCh2.text = userData.textCh2
        holder.textCh3.text = userData.textCh3
        holder.textCh4.text = userData.textCh4
        holder.textCh5.text = userData.textCh5
        holder.textCh6.text = userData.textCh6
        holder.textCh7.text = userData.textCh7
        holder.textCh8.text = userData.textCh8

    }

    override fun getItemCount(): Int {
        return data.size
    }
}