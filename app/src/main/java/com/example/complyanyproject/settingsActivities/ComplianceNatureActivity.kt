package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.adapter.ComplianceNatureAdapter
import com.example.complyanyproject.adapter.IndustryTypeAdapter
import com.example.complyanyproject.databinding.ActivityComplianceNatureBinding
import com.example.complyanyproject.databinding.ActivityIndustryTypeBinding
import com.example.complyanyproject.model.ComplianceNatureModelClass
import com.example.complyanyproject.model.IndustryTypeModelClass
import com.example.complyanyproject.model.UserRoleModelClass

class ComplianceNatureActivity : AppCompatActivity() {

    private lateinit var binding : ActivityComplianceNatureBinding
    lateinit var adapter: ComplianceNatureAdapter

    val itemList : ArrayList<ComplianceNatureModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComplianceNatureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backComplianceNature.setOnClickListener {
            onBackPressed()
        }

        val data1 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data2 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data3 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data4 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data5 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data6 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data7 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data8 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data9 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")
        val data10 = ComplianceNatureModelClass("Payment", "03-03-2022 4.05 pm")

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


        binding.recyclerViewComplianceNature.layoutManager = LinearLayoutManager(this)
        adapter = ComplianceNatureAdapter(this, itemList)
        binding.recyclerViewComplianceNature.adapter = adapter

    }

    override fun onBackPressed() {
        finish()
    }
}