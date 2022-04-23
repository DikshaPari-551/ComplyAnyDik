package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ClientGroupAdapter
import com.example.complyanyproject.model.ClientGroupModelClass

class ClientGroupActivity : AppCompatActivity() {

    lateinit var adapter: ClientGroupAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var Back: TextView
    lateinit var addIconClientGroup: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_group)

        recyclerView = findViewById(R.id.clientgroup_recyclerView)
        Back = findViewById(R.id.CreatSubDepartmentBack)
        addIconClientGroup = findViewById(R.id.enter)


        val itemList: ArrayList<ClientGroupModelClass> = ArrayList()

        val data1 = ClientGroupModelClass("Aman")



        itemList.add(data1)
        itemList.add(data1)
        itemList.add(data1)
        itemList.add(data1)
        itemList.add(data1)


        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ClientGroupAdapter(this, itemList)

        recyclerView.adapter = adapter

        addIconClientGroup.setOnClickListener {
            Intent(this, CreateClientGroupActivity::class.java).also {
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
