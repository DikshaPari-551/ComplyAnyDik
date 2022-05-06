package com.example.complyanyproject.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.CreateCalenderManagementActivity
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.ClientManagementModelClass

class ClientManagementAdapter(val context: Context, val itemList : ArrayList<ClientManagementModelClass>, val onRvClickListener: OnRecyclerClickListener):
    RecyclerView.Adapter<ClientManagementAdapter.ClientManagementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientManagementAdapter.ClientManagementViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.client_management_recycler_layout , parent , false)
        return ClientManagementViewHolder(view)

    }
    override fun onBindViewHolder(holder: ClientManagementViewHolder, position: Int) {
        val userData = itemList[position]

        holder.itemName.text = userData.clientName
        holder.itemGroup.text = userData.clientGroup
        holder.itemSubGroup.text = userData.clientSubGroup
        holder.itemTaxNo.text = userData.incomeTaxNo
        holder.itemAddress.text = userData.address
        holder.itemContact.text = userData.contact
        holder.itemEmail.text = userData.emailId
        holder.itemMobile.text = userData.mobileNo

        holder.layout.setOnClickListener {
            onRvClickListener.onClick(position)
        }

        holder.imgEdit.setOnClickListener {
            Toast.makeText(context, "Clicked on edit button", Toast.LENGTH_SHORT).show()
        }

        holder.imgDelete.setOnClickListener {
            Toast.makeText(context, "Clicked on delete button", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ClientManagementViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        val itemName = view.findViewById<TextView>(R.id.itemName)
        val itemGroup = view.findViewById<TextView>(R.id.itemGroup)
        val itemSubGroup = view.findViewById<TextView>(R.id.itemSubGroup)
        val itemTaxNo = view.findViewById<TextView>(R.id.itemTaxNo)
        val itemAddress = view.findViewById<TextView>(R.id.itemAddress)
        val itemContact = view.findViewById<TextView>(R.id.itemContact)
        val itemEmail = view.findViewById<TextView>(R.id.itemEmail)
        val itemMobile = view.findViewById<TextView>(R.id.itemMobile)
        val layout = view.findViewById<CardView>(R.id.layout)
        val imgEdit = view.findViewById<ImageView>(R.id.imgEdit)
        val imgDelete = view.findViewById<ImageView>(R.id.imgDelete)

    }


}