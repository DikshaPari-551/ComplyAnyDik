package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.RegisterEmailNotificationAdapter
import com.example.complyanyproject.model.RegisterEmailModelClass
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

class RegisterEmailNotificationActivity : AppCompatActivity() {

    lateinit var etSelectEntity: TextView
    lateinit var backButton : LinearLayout
    lateinit var imgFilter : ImageView

    lateinit var recyclerView : RecyclerView
    lateinit var adapter : RegisterEmailNotificationAdapter

    val itemList : ArrayList<RegisterEmailModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_email_notification)

        etSelectEntity = findViewById(R.id.etSelectEntity)
        backButton = findViewById(R.id.backButton)
        imgFilter = findViewById(R.id.imgFilter)
        recyclerView = findViewById(R.id.recyclerViewRegisterEmail)

        etSelectEntity.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        backButton.setOnClickListener {
            finish()
        }

        imgFilter.setOnClickListener {
            onBackPressed()
        }


        val data1 = RegisterEmailModelClass("testing")
        val data2 = RegisterEmailModelClass("testing")
        val data3 = RegisterEmailModelClass("testing")
        val data4 = RegisterEmailModelClass("testing")
        val data5 = RegisterEmailModelClass("testing")
        val data6 = RegisterEmailModelClass("testing")
        val data7 = RegisterEmailModelClass("testing")
        val data8 = RegisterEmailModelClass("testing")
        val data9 = RegisterEmailModelClass("testing")
        val data10 = RegisterEmailModelClass("testing")
        val data11 = RegisterEmailModelClass("testing")
        val data12 = RegisterEmailModelClass("testing")

        itemList.add(data1)
        itemList.add(data12)
        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)
        itemList.add(data7)
        itemList.add(data8)
        itemList.add(data9)
        itemList.add(data1)
        itemList.add(data10)
        itemList.add(data11)
        itemList.add(data12)



        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = RegisterEmailNotificationAdapter(this, itemList)
        recyclerView.adapter = adapter

    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode ==  1){
            if (resultCode == Activity.RESULT_OK){
                etSelectEntity.text = data?.getStringExtra("hello")
            }
        }
    }
}