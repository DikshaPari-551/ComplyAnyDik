package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ComplianceNatureModelClass

class ComplianceNatureAdapter(val context: Context, val itemList : ArrayList<ComplianceNatureModelClass> ):
    RecyclerView.Adapter<ComplianceNatureAdapter.ComplianceNatureViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComplianceNatureViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.compliace_nature_recycler_layout, parent, false)
        return ComplianceNatureViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComplianceNatureViewHolder, position: Int) {
        val userData = itemList[position]

        holder.complianceNature.text = userData.complianceNature
        holder.complianceNatureCreatedAt.text = userData.createdAt

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ComplianceNatureViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val complianceNature : TextView = view.findViewById(R.id.complianceNature)
        val complianceNatureCreatedAt : TextView = view.findViewById(R.id.complianceNatureCreatedAt)
    }
}