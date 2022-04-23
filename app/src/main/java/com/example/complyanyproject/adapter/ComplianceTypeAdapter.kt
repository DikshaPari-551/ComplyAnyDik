package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ComplianceNatureModelClass
import com.example.complyanyproject.model.ComplianceTypeModelClass

class ComplianceTypeAdapter(val context: Context, val itemList : ArrayList<ComplianceTypeModelClass> ):
    RecyclerView.Adapter<ComplianceTypeAdapter.ComplianceTypeViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComplianceTypeViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.compliance_type_recycler_layout, parent, false)
        return ComplianceTypeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComplianceTypeViewHolder, position: Int) {
        val userData = itemList[position]

        holder.complianceType.text = userData.complianceType

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ComplianceTypeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val complianceType: TextView = view.findViewById(R.id.complianceType)
    }
}