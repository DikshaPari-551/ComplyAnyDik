package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.adapter.IndustryTypeAdapter
import com.example.complyanyproject.adapter.StockExchangeAdapter
import com.example.complyanyproject.databinding.ActivityIndustryTypeBinding
import com.example.complyanyproject.databinding.ActivityStockExchangeBinding
import com.example.complyanyproject.model.EntityTypeModelClass
import com.example.complyanyproject.model.IndustryTypeModelClass
import com.example.complyanyproject.model.StockExchangeModelClass

class StockExchangeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityStockExchangeBinding
    lateinit var adapter: StockExchangeAdapter

    val itemList : ArrayList<StockExchangeModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStockExchangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backStockExchange.setOnClickListener {
            onBackPressed()
        }

        val data1 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data2 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data3 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data4 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data5 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data6 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data7 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data8 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data9 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")
        val data10 = StockExchangeModelClass("Austrailia", "NSEOA","03-03-2022 4.05 pm")

        itemList.add(data1)
        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)
        itemList.add(data7)
        itemList.add(data8)
        itemList.add(data9)
        itemList.add(data10)
        itemList.add(data1)
        itemList.add(data1)
        itemList.add(data1)
        itemList.add(data1)


        binding.recyclerViewStockExchange.layoutManager = LinearLayoutManager(this)
        adapter = StockExchangeAdapter(this, itemList)
        binding.recyclerViewStockExchange.adapter = adapter

        // added toast on add button
        binding.addStockExchange.setOnClickListener {
            Toast.makeText(this, "work in progress...", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}