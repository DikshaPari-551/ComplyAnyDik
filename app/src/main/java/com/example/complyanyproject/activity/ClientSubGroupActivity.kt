package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ClientSubGroupAdapter
import com.example.complyanyproject.model.ClientSubGroupModelClass

class ClientSubGroupActivity : AppCompatActivity() {

    lateinit var adapter: ClientSubGroupAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var Back: TextView
    lateinit var Enter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_sub_group)

        recyclerView = findViewById(R.id.clientsubgroup_recyclerView)
        Back = findViewById(R.id.CreatSubDepartmentBack)
        Enter = findViewById(R.id.Enter)


        val itemList : ArrayList<ClientSubGroupModelClass> = ArrayList()

        val data1 = ClientSubGroupModelClass("Aman","Raj")
        val data2 = ClientSubGroupModelClass("Aman","Raj")
        val data3 = ClientSubGroupModelClass("Aman","Raj")
        val data4 = ClientSubGroupModelClass("Aman","Raj")
        val data5 = ClientSubGroupModelClass("Aman","Raj")
        val data6 = ClientSubGroupModelClass("Aman","Raj")


        itemList.add(data1)
        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)


        recyclerView.layoutManager = LinearLayoutManager(this )

        adapter = ClientSubGroupAdapter(this, itemList)

        recyclerView.adapter = adapter


        Enter.setOnClickListener{
            Intent(this, CreateClientSubGroupActivity::class.java).also {
                startActivity(it)
            }
        }

        Back.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}