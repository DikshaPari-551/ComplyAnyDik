package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateClientSubGroupBinding

class CreateClientSubGroupActivity : AppCompatActivity() {

    lateinit var back: TextView
    lateinit var saved: ImageView
    lateinit var ClientGroupName: TextView
    lateinit var SubClientGroupName: EditText
    lateinit var tv_ClientGroupName: TextView
    lateinit var tv_ClientSubGroupName: TextView
    lateinit var selectClientGroup: RelativeLayout

    private lateinit var binding : ActivityCreateClientSubGroupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateClientSubGroupBinding.inflate(layoutInflater)
        setContentView(binding.root)

                back = findViewById(R.id.CreatSubDepartmentBack)
                saved = findViewById(R.id.plus1)
                ClientGroupName = findViewById(R.id.txtClientGroupName)
                SubClientGroupName = findViewById(R.id.SubDepartmentName)
                tv_ClientGroupName = findViewById(R.id.tv_CreateSubDepatment)
                tv_ClientSubGroupName = findViewById(R.id.tv_SubDepartmentName)
                selectClientGroup = findViewById(R.id.selectDepatment)


                saved.setOnClickListener{

            if (ClientGroupName.text.toString().isEmpty()){
                tv_ClientGroupName.text = "*Select Department"
            }
            else if(SubClientGroupName.text.toString().isEmpty()){
                tv_ClientGroupName.text =""
                tv_ClientSubGroupName.text = "*Please enter Client Sub Group Name"
            }
            else {
                tv_ClientGroupName.text = ""
                tv_ClientSubGroupName.text = ""

                Toast.makeText(this,"successfully Created...", Toast.LENGTH_SHORT).show()
                finish()
                }
            }


            binding.CreatSubDepartmentBack.setOnClickListener{
                    onBackPressed()
            }

            selectClientGroup.setOnClickListener {
            Intent(this, SelectorClientSubGroupActivity::class.java).also {
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
                binding.txtClientGroupName.text = data?.getStringExtra("clientSubGroup")
            }
        }
    }

}