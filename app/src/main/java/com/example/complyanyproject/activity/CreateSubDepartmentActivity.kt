package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.complyanyproject.R

class CreateSubDepartmentActivity : AppCompatActivity() {

    lateinit var saveSubDepartment : ImageView
    lateinit var txtSelectDeparmentName : TextView
    lateinit var checkDepartmentName : TextView
    lateinit var SelectSubDepartmentName : EditText
    lateinit var checkSubDepartmentName : TextView
    lateinit var backCreateSubDepartment : TextView
    lateinit var selectDepartment : RelativeLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_sub_department)

        saveSubDepartment = findViewById(R.id.saveSubDepartment)
        txtSelectDeparmentName = findViewById(R.id.txtSelectDeparmentName)
        checkDepartmentName = findViewById(R.id.checkDepartmentName)
        SelectSubDepartmentName = findViewById(R.id.SelectSubDepartmentName)
        checkSubDepartmentName = findViewById(R.id.checkSubDepartmentName)
        backCreateSubDepartment = findViewById(R.id.backCreateSubDepartment)
        selectDepartment = findViewById(R.id.selectDepartment)


        saveSubDepartment.setOnClickListener{

            if (txtSelectDeparmentName.text.toString().isEmpty()){
                checkDepartmentName.text = "*Select Department"
            }
            else if(SelectSubDepartmentName.text.toString().isEmpty()){
                checkDepartmentName.text =""
                checkSubDepartmentName.text = "*Please enter Client Sub Group Name"
            }
            else {
                checkDepartmentName.text = ""
                checkSubDepartmentName.text = ""

                Toast.makeText(this,"successfully Created...", Toast.LENGTH_SHORT).show()
                    finish()
            }
        }


        backCreateSubDepartment.setOnClickListener{
            onBackPressed()
        }
//
        selectDepartment.setOnClickListener {
            Intent(this, ListSubDepartmentActivity::class.java).also {
                startActivityForResult(it, 1)
            }

        }


    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                txtSelectDeparmentName.text = data?.getStringExtra("clientSubDepartment")
            }
        }
    }

}