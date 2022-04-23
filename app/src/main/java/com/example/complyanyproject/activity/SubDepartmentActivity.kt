package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.SubDepartmentAdapter
import com.example.complyanyproject.databinding.ActivitySubDepartmentBinding
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.SubDepartmentModelClass

class SubDepartmentActivity : AppCompatActivity() {

    lateinit var adapter : SubDepartmentAdapter
    val itemList : ArrayList<SubDepartmentModelClass> = ArrayList()

    private lateinit var binding : ActivitySubDepartmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data1 = SubDepartmentModelClass("It", "Android")
        val data2 = SubDepartmentModelClass("It", "React Native")
        val data3 = SubDepartmentModelClass("It", "Angular Js")
        val data4 = SubDepartmentModelClass("It", "Android")
        val data5 = SubDepartmentModelClass("It", "React Native")
        val data6 = SubDepartmentModelClass("It", "Angular Js")

        itemList.add(data1)
        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)


        binding.recyclerViewSubDepartment.layoutManager = LinearLayoutManager(this)
        adapter = SubDepartmentAdapter(this, itemList)
        binding.recyclerViewSubDepartment.adapter = adapter


        binding.backSubDepartment.setOnClickListener {
            onBackPressed()
        }

        binding.addSubDepartment.setOnClickListener {
            Intent(this, CreateSubDepartmentActivity::class.java).also{
                startActivity(it)
            }
        }
    }


    override fun onBackPressed() {
        finish()
    }

}