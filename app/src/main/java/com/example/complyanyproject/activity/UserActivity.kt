package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ResourceAdapter
import com.example.complyanyproject.adapter.UserAdapter
import com.example.complyanyproject.databinding.ActivityUserBinding
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.ModelClass

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    lateinit var recyclerView : RecyclerView
    lateinit var adapter: UserAdapter

    val itemList : ArrayList<ModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        recyclerView = findViewById(R.id.recyclerView)

        binding.toolbarBackIcon.setOnClickListener {
            finish()
        }

        binding.toolbarUsersAddIcon.setOnClickListener {
            Intent(this, CreateUserActivity::class.java).also{
                startActivity(it)
            }
        }



        val data1 = ModelClass("Masoom","0001", "mz@gmail.com","6392654000")
        val data2 = ModelClass("Vishal","0002", "vk@gmail.com","4664546434")
        val data3 = ModelClass("Mohit","0003", "mk@gmail.com","4654132463")
        val data4 = ModelClass("Aditya","0004", "ad@gmail.com","2564897130")
        val data5 = ModelClass("Rajdeep","0005", "ry@gmail.com","4579513646")
        val data6 = ModelClass("Manish","0006", "mp@gmail.com","1234564894")
        val data7 = ModelClass("Ehtesham","0007", "ea@gmail.com","1234579161")
        val data8 = ModelClass("Prateek","0008", "pk@gmail.com","6524376913")
        val data9 = ModelClass("Anurag","0009", "aa@gmail.com","6956713647")
        val data10 = ModelClass("Diksha","0010", "dy@gmail.com","4517326474")
        val data11 = ModelClass("Karishma","0011", "kt@gmail.com","5647231647")
        val data12 = ModelClass("Anuj","0012", "ak@gmail.com","6392654000")
        val data13 = ModelClass("Abhilash","0013", "as@gmail.com","5941346794")

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
        itemList.add(data12)
        itemList.add(data11)
        itemList.add(data13)


        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = UserAdapter(this, itemList, object : OnRecyclerClickListener{
            override fun onClick(pos: Int) {
                View.GONE
            }

        })
        recyclerView.adapter = adapter

    }

    override fun onBackPressed() {
        finish()
    }

}