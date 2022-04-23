package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ClientManagementAdapter
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.ClientManagementModelClass

class ClientManagement : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter: ClientManagementAdapter
    lateinit var addIconClientManagement: TextView
    lateinit var backClientManagement: TextView

    val itemList : ArrayList<ClientManagementModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_management)

        recyclerView = findViewById(R.id.recyclerViewClientManagement)
        addIconClientManagement = findViewById(R.id.addIconClientManagement)
        backClientManagement = findViewById(R.id.backClientManagement)

        addIconClientManagement.setOnClickListener {
            Toast.makeText(this, "touched", Toast.LENGTH_SHORT).show()
        }

        backClientManagement.setOnClickListener {
            onBackPressed()
        }


        val data1 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data2 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data3 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data4 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data5 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data6 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data7 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data8 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data9 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")
        val data10 = ClientManagementModelClass("Masoom", "Rajasthan","Bikaner", "23423", "wubasdjb", "46131", "jasbdjabd.com", "4562132")


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


        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ClientManagementAdapter(this, itemList , object : OnRecyclerClickListener {
            override fun onClick(pos: Int) {


            //                View.GONE
//                Toast.makeText(this@ClientManagement, "asdahd", Toast.LENGTH_SHORT).show()
            }

        })
        recyclerView.adapter = adapter
    }

    override fun onBackPressed() {
        finish()
    }
}