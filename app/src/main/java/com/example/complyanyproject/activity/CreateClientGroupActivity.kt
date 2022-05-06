package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R

class CreateClientGroupActivity : AppCompatActivity() {

    lateinit var backButton: TextView
    lateinit var SaveButton: ImageView
    lateinit var tv_ClientGroup: TextView
    lateinit var ClientGroupManagement: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_client_group)

        backButton = findViewById(R.id.CreatSubDepartmentBack)
        SaveButton = findViewById(R.id.saveButton)
        tv_ClientGroup = findViewById(R.id.tv_ClientGroup)
        ClientGroupManagement = findViewById(R.id.ClientGroupManagement)


        SaveButton.setOnClickListener{

            if (ClientGroupManagement.text.toString().isEmpty()){
                tv_ClientGroup.text = "Required"
            }
            else {
                tv_ClientGroup.text = ""
                val saved = ClientGroupManagement.text.toString().trim()
                Toast.makeText(this,"successfully Created", Toast.LENGTH_SHORT).show()
                    finish()
            }
        }
        backButton.setOnClickListener{
            onBackPressed()
            }
        }

    override fun onBackPressed() {
        finish()
    }
    }
