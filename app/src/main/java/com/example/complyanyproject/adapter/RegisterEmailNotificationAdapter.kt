package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.RegisterEmailModelClass

class RegisterEmailNotificationAdapter(val context: Context, val itemList : ArrayList<RegisterEmailModelClass> ):
    RecyclerView.Adapter<RegisterEmailNotificationAdapter.RegisterEmailNotificationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegisterEmailNotificationViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.register_email_recyler_layout, parent , false)
        return RegisterEmailNotificationViewHolder(view)
    }

    override fun onBindViewHolder(holder: RegisterEmailNotificationViewHolder, position: Int) {
        val userData =itemList[position]

        holder.txtName.text = userData.name
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class RegisterEmailNotificationViewHolder(val view: View) : RecyclerView.ViewHolder(view)  {

        val txtName : TextView = view.findViewById(R.id.txtName)


    }
}