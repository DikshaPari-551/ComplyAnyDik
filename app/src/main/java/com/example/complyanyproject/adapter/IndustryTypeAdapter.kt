package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.IndustryTypeModelClass

class IndustryTypeAdapter(val context: Context, val itemList : ArrayList<IndustryTypeModelClass> ):
    RecyclerView.Adapter<IndustryTypeAdapter.IndustryTypeViewHolder>() {



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IndustryTypeViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.industry_type_recycler_layout, parent, false)
        return IndustryTypeViewHolder(view)
    }

    override fun onBindViewHolder(holder: IndustryTypeViewHolder, position: Int) {
        val userData = itemList[position]

        holder.industryType.text = userData.industryType
        holder.industryTypeCreatedAt.text = userData.CreatedAt
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class IndustryTypeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val industryType : TextView = view.findViewById(R.id.industryType)
        val industryTypeCreatedAt : TextView = view.findViewById(R.id.industryTypeCreatedAt)
    }
}