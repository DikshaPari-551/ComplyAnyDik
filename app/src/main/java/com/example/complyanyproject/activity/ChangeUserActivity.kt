package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ChangeUserAdapter
import com.example.complyanyproject.adapter.UserAdapter
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.ChangeUserModelClass
import com.example.complyanyproject.model.ModelClass

class ChangeUserActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter: ChangeUserAdapter
    lateinit var backChangeUser : TextView
    lateinit var addIconChangeUser : TextView

    val itemList : ArrayList<ChangeUserModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_user)

        recyclerView = findViewById(R.id.recyclerView)
        backChangeUser = findViewById(R.id.backChangeUser)
        addIconChangeUser = findViewById(R.id.addIconChangeUser)

        backChangeUser.setOnClickListener {
            onBackPressed()
        }

        addIconChangeUser.setOnClickListener {
            Intent(this, CreateChangeUserActivity::class.java).also{
                startActivity(it)
            }
        }


        val data2 = ChangeUserModelClass("Vishal","0002", "vk@gmail.com","4664546434")
        val data3 = ChangeUserModelClass("Mohit","0003", "mk@gmail.com","4654132463")
        val data4 = ChangeUserModelClass("Aditya","0004", "ad@gmail.com","2564897130")
        val data5 = ChangeUserModelClass("Rajdeep","0005", "ry@gmail.com","4579513646")
        val data6 = ChangeUserModelClass("Manish","0006", "mp@gmail.com","1234564894")
        val data7 = ChangeUserModelClass("Ehtesham","0007", "ea@gmail.com","1234579161")
        val data8 = ChangeUserModelClass("Prateek","0008", "pk@gmail.com","6524376913")
        val data9 = ChangeUserModelClass("Anurag","0009", "aa@gmail.com","6956713647")
        val data10 = ChangeUserModelClass("Diksha","0010", "dy@gmail.com","4517326474")
        val data11 = ChangeUserModelClass("Karishma","0011", "kt@gmail.com","5647231647")
        val data12 = ChangeUserModelClass("Anuj","0012", "ak@gmail.com","6392654000")
        val data13 = ChangeUserModelClass("Abhilash","0013", "as@gmail.com","5941346794")

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

        adapter = ChangeUserAdapter(this, itemList)
        recyclerView.adapter = adapter
    }

    override fun onBackPressed() {
        finish()
    }
}