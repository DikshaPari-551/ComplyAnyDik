package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ComplianceNatureAdapter
import com.example.complyanyproject.adapter.ComplianceTypeAdapter
import com.example.complyanyproject.databinding.ActivityComlianceTypeBinding
import com.example.complyanyproject.databinding.ActivityComplianceNatureBinding
import com.example.complyanyproject.model.ComplianceNatureModelClass
import com.example.complyanyproject.model.ComplianceTypeModelClass

class ComplianceTypeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityComlianceTypeBinding
    lateinit var adapter: ComplianceTypeAdapter

    val itemList : ArrayList<ComplianceTypeModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComlianceTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backComplianceType.setOnClickListener {
            onBackPressed()
        }

        val data1 = ComplianceTypeModelClass("Labour Law")
        val data2 = ComplianceTypeModelClass("Labour Law" )
        val data3 = ComplianceTypeModelClass("Labour Law")
        val data4 = ComplianceTypeModelClass("Labour Law")
        val data5 = ComplianceTypeModelClass("Labour Law")
        val data6 = ComplianceTypeModelClass("Labour Law")
        val data7 = ComplianceTypeModelClass("Labour Law")
        val data8 = ComplianceTypeModelClass("Labour Law")
        val data9 = ComplianceTypeModelClass("Labour Law")
        val data10 = ComplianceTypeModelClass("Labour Law")

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


        binding.recyclerViewComplianceType.layoutManager = LinearLayoutManager(this)
        adapter = ComplianceTypeAdapter(this, itemList)
        binding.recyclerViewComplianceType.adapter = adapter

    }

    override fun onBackPressed() {
        finish()
    }
}