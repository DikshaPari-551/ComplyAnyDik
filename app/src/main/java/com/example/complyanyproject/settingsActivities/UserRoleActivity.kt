package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.adapter.StockExchangeAdapter
import com.example.complyanyproject.adapter.UserRoleAdapter
import com.example.complyanyproject.databinding.ActivityStockExchangeBinding
import com.example.complyanyproject.databinding.ActivityUserRoleBinding
import com.example.complyanyproject.model.StockExchangeModelClass
import com.example.complyanyproject.model.UserRoleModelClass

class UserRoleActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUserRoleBinding
    lateinit var adapter: UserRoleAdapter

    val itemList : ArrayList<UserRoleModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserRoleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backUserRole.setOnClickListener {
            onBackPressed()
        }

        val data1 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data2 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data3 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data4 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data5 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data6 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data7 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data8 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data9 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")
        val data10 = UserRoleModelClass("Regional Head", "03-03-2022 4.05 pm")

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


        binding.recyclerViewUserRole.layoutManager = LinearLayoutManager(this)
        adapter = UserRoleAdapter(this, itemList)
        binding.recyclerViewUserRole.adapter = adapter

        // added toast on add button
        binding.addUserRole.setOnClickListener {
            Toast.makeText(this, "work in progress...", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}