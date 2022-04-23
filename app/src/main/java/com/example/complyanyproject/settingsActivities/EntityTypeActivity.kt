package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.EntityTypeAdapter
import com.example.complyanyproject.databinding.ActivityEntityTypeBinding
import com.example.complyanyproject.model.EntityTypeModelClass
import com.example.complyanyproject.model.UserRoleModelClass

class EntityTypeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEntityTypeBinding
    lateinit var adapter: EntityTypeAdapter

    val itemList : ArrayList<EntityTypeModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntityTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backEntityType.setOnClickListener {
            onBackPressed()
        }

        val data1 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data2 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data3 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data4 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data5 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data6 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data7 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data8 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data9 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")
        val data10 = EntityTypeModelClass("Afganistan", "asdadad","03-03-2022 4.05 pm")

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


        binding.recyclerViewEntityType.layoutManager = LinearLayoutManager(this)
        adapter = EntityTypeAdapter(this, itemList)
        binding.recyclerViewEntityType.adapter = adapter

    }

    override fun onBackPressed() {
        finish()
    }
}