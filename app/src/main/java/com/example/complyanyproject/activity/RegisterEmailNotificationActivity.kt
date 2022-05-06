package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.RegisterEmailNotificationAdapter
import com.example.complyanyproject.model.RegisterEmailModelClass
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

class RegisterEmailNotificationActivity : AppCompatActivity() {

    lateinit var etSelectEntity: TextView
    lateinit var backButton : TextView
    lateinit var imgFilter : ImageView

    lateinit var etUserRegister : EditText
    lateinit var etEmailRegister : EditText

    lateinit var txtUserName : TextView
    lateinit var txtEmailID : TextView
    lateinit var txtEntity : TextView


    lateinit var recyclerView : RecyclerView
    lateinit var adapter : RegisterEmailNotificationAdapter

    val itemList : ArrayList<RegisterEmailModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_email_notification)

        backButton = findViewById(R.id.backButton)
        imgFilter = findViewById(R.id.imgFilter)
        recyclerView = findViewById(R.id.recyclerViewRegisterEmail)
        etEmailRegister = findViewById(R.id.etEmailRegister)
        etUserRegister = findViewById(R.id.etUserRegister)
        txtUserName = findViewById(R.id.txtUserName)
        txtEmailID = findViewById(R.id.txtEmailID)
        txtEntity = findViewById(R.id.txtEntity)

        etSelectEntity.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        backButton.setOnClickListener {
            finish()
        }

        imgFilter.setOnClickListener {

            val userName = etUserRegister.text.toString().trim()
            val email = etEmailRegister.text.toString().trim()

            if (userName.isEmpty()){
                txtUserName.visibility = View.VISIBLE
                txtUserName.text = "*Required"
            }
            else if(email.isEmpty()){
                txtUserName.visibility = View.GONE
                txtEmailID.visibility = View.VISIBLE
                txtEmailID.text = "*Required"
            }
            else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                txtUserName.visibility = View.GONE
                txtEmailID.visibility = View.VISIBLE
                txtEmailID.text = "*Please enter valid email"
            }
            else if(etSelectEntity.text.isEmpty()){
                txtUserName.visibility = View.GONE
                txtEmailID.visibility = View.GONE
                txtEntity.visibility = View.VISIBLE
                txtEntity.text = "*Required"
            }
            else{
                txtUserName.visibility = View.GONE
                txtEmailID.visibility = View.GONE
                txtEntity.visibility = View.GONE

                txtEntity.text = ""
                txtUserName.text = ""
                txtEmailID.text = ""

                etEmailRegister.text.clear()
                etUserRegister.text.clear()
                etSelectEntity.text = ""

                Toast.makeText(this, "Registered..", Toast.LENGTH_SHORT).show()
                onBackPressed()
            }

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

/*
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode ==  1){
            if (resultCode == Activity.RESULT_OK){
                etSelectEntity.text = data?.getStringExtra("hello")
            }
        }
    }
*/
}