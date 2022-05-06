package com.example.complyanyproject.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.CreateClientGroupActivity
import com.example.complyanyproject.model.ClientGroupModelClass

class ClientGroupAdapter(val context: Context, val itemList : ArrayList<ClientGroupModelClass> ):
    RecyclerView.Adapter<ClientGroupAdapter.myViewHolder>() {



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
        holder.CG_Edit.setOnClickListener {
            Intent(context, CreateClientGroupActivity::class.java).also {
                context.startActivity(it)
            }
        }

        holder.CG_Delete.setOnClickListener {
            Toast.makeText(context, "Clicked on delete button", Toast.LENGTH_SHORT).show()
        }
    }

    class myViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val ClientGroupName: TextView = view.findViewById(R.id.CG_NameTextview)
        val CG_Edit : ImageView = view.findViewById(R.id.CG_Edit)
        val CG_Delete : ImageView = view.findViewById(R.id.CG_Delete)


    }

}