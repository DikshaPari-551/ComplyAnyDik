package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.IndustryTypeModelClass
import com.example.complyanyproject.model.StockExchangeModelClass

class StockExchangeAdapter(val context: Context, val itemList : ArrayList<StockExchangeModelClass> ):
    RecyclerView.Adapter<StockExchangeAdapter.StockExchangeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockExchangeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.stock_exchange_recycler_layout, parent , false)
        return StockExchangeViewHolder(view)
    }

    override fun onBindViewHolder(holder: StockExchangeViewHolder, position: Int) {
        val userData =itemList[position]

        holder.stockExchangeCountry.text = userData.country
        holder.stockExchange.text = userData.stockExchange
        holder.stockExchangeCreatedAt.text = userData.createdAt

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

    class StockExchangeViewHolder(val view: View) : RecyclerView.ViewHolder(view)  {

        val stockExchangeCountry : TextView = view.findViewById(R.id.stockExchangeCountry)
        val stockExchange : TextView = view.findViewById(R.id.stockExchange)
        val stockExchangeCreatedAt : TextView = view.findViewById(R.id.stockExchangeCreatedAt)

        val imgEdit = view.findViewById<ImageView>(R.id.imgEdit)
        val imgDelete = view.findViewById<ImageView>(R.id.imgDelete)
    }

}