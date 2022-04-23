package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.EntityTypeAdapter
import com.example.complyanyproject.adapter.IndustryTypeAdapter
import com.example.complyanyproject.databinding.ActivityEntityTypeBinding
import com.example.complyanyproject.databinding.ActivityIndustryTypeBinding
import com.example.complyanyproject.model.EntityTypeModelClass
import com.example.complyanyproject.model.IndustryTypeModelClass
import com.example.complyanyproject.model.UserRoleModelClass

class IndustryTypeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityIndustryTypeBinding
    lateinit var adapter: IndustryTypeAdapter

    val itemList : ArrayList<IndustryTypeModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIndustryTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backIndustryType.setOnClickListener {
            onBackPressed()
        }


        val data1 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data2 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data3 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data4 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data5 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data6 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data7 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data8 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data9 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")
        val data10 = IndustryTypeModelClass("Airlines", "03-03-2022 4.05 pm")

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


        binding.recyclerViewIndustryType.layoutManager = LinearLayoutManager(this)
        adapter = IndustryTypeAdapter(this, itemList)
        binding.recyclerViewIndustryType.adapter = adapter

    }

    override fun onBackPressed() {
        finish()
    }
}