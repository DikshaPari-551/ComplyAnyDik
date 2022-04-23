package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ClientSubGroupModelClass

class ClientSubGroupAdapter (val context: Context, val itemList : ArrayList<ClientSubGroupModelClass> ): RecyclerView.Adapter<ClientSubGroupAdapter.myViewHolder>() {


    class myViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val ClientGroupName: TextView = view.findViewById(R.id.CG_NameTextview)
        val ClientSubGroupName: TextView = view.findViewById(R.id.CSG_Textview1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientSubGroupAdapter.myViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.client_sub_group_recycler_layout, parent, false)
        return myViewHolder(view)

    }


    override fun getItemCount(): Int {
        return itemList.size


    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val text = itemList[position]
        holder.ClientGroupName.text = text.ClientGroupName
        holder.ClientSubGroupName.text = text.ClientSubGroupName
    }

}