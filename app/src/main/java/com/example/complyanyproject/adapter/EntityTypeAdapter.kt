package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ClientGroupModelClass
import com.example.complyanyproject.model.EntityTypeModelClass

class EntityTypeAdapter(val context: Context, val itemList : ArrayList<EntityTypeModelClass> ):
    RecyclerView.Adapter<EntityTypeAdapter.EntityTypeViewHolder>() {




    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EntityTypeAdapter.EntityTypeViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.entity_type_recycler_layout, parent, false)
        return EntityTypeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EntityTypeAdapter.EntityTypeViewHolder, position: Int) {
        val userData = itemList[position]

        holder.entityTypeCountry.text = userData.country
        holder.entityType.text = userData.entityType
        holder.entityTypeCreatedAt.text = userData.createdAt

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class EntityTypeViewHolder(val view: View) : RecyclerView.ViewHolder(view)  {
        val entityTypeCountry : TextView = view.findViewById(R.id.entityTypeCountry)
        val entityType : TextView = view.findViewById(R.id.entityType)
        val entityTypeCreatedAt : TextView = view.findViewById(R.id.entityTypeCreatedAt)
    }


}