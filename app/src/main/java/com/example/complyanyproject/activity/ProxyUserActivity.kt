package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ChangeUserAdapter
import com.example.complyanyproject.adapter.ProxyUserAdapter
import com.example.complyanyproject.model.ChangeUserModelClass
import com.example.complyanyproject.model.ProxyUserModelClass

class ProxyUserActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter: ProxyUserAdapter
    lateinit var backProxyUser : TextView
    lateinit var addIconProxyUser : TextView

    val itemList : ArrayList<ProxyUserModelClass> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proxy_user)

        recyclerView = findViewById(R.id.recyclerView)
        backProxyUser = findViewById(R.id.backProxyUser)
        addIconProxyUser = findViewById(R.id.addIconProxyUser)

        // added back method
        backProxyUser.setOnClickListener {
            onBackPressed()
        }

        // added clicks on add button
        addIconProxyUser.setOnClickListener {
            Intent(this, CreateProxyUserActivity::class.java).also{
                startActivity(it)
            }
        }


        val data2 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data3 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data4 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data5 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data6 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data7 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data8 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data9 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data10 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data11 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data12 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")
        val data13 = ProxyUserModelClass("Harry Porter","rakesh", "Food Department","14-4-2002")

        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)
        itemList.add(data7)
        itemList.add(data8)
        itemList.add(data9)
        itemList.add(data10)
        itemList.add(data12)
        itemList.add(data11)
        itemList.add(data13)

        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ProxyUserAdapter(this, itemList)
        recyclerView.adapter = adapter
    }

    override fun onBackPressed() {
        finish()
    }
}