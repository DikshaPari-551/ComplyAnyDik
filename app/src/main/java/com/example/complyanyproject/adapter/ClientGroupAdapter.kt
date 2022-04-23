package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ClientGroupModelClass

class ClientGroupAdapter(val context: Context, val itemList : ArrayList<ClientGroupModelClass> ):
    RecyclerView.Adapter<ClientGroupAdapter.myViewHolder>() {


    class myViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val ClientGroupName: TextView = view.findViewById(R.id.CG_NameTextview)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClientGroupAdapter.myViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.client_group_recycler_layout, parent, false)
        return myViewHolder(view)

    }


    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val text = itemList[position]
        holder.ClientGroupName.text = text.ClientGroupName
    }

}