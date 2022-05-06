package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ResourceAdapter
import com.example.complyanyproject.databinding.ActivityResourceManagementBinding
import com.example.complyanyproject.model.ResourceModelClass
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity
import com.example.complyanyproject.selectorActivity.LawNatureActivity
import com.example.complyanyproject.selectorActivity.LawTypeActivity
import com.example.complyanyproject.selectorActivity.StateActivity

class ResourceManagementActivity : AppCompatActivity() {

    lateinit var adapter: ResourceAdapter

    private lateinit var binding: ActivityResourceManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourceManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

        // handle recyclerView
        val itemList : ArrayList<ResourceModelClass> = ArrayList()


        val data1 = ResourceModelClass("India", "Delhi", "Artical 112", "abc", "law", "123kb","today")
        itemList.add(data1)

        binding.recyclerView.layoutManager = LinearLayoutManager(this )

        adapter = ResourceAdapter(this, itemList)

        binding.recyclerView.adapter = adapter


        // added clicks on select options
        binding.selectNatureType.setOnClickListener {
            Intent(this, LawNatureActivity::class.java).also{
               startActivityForResult(it, 1)
            }
        }

        binding.selectLawType.setOnClickListener {
            Intent(this, LawTypeActivity::class.java).also{
                startActivityForResult(it, 2)
            }
        }

        binding.selectCountry.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 3)
            }
        }

        binding.selectState.setOnClickListener {
            Intent(this, StateActivity::class.java).also{
                startActivityForResult(it, 4)
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // lawNature
        if(requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                binding.selectNatureType.text = data?.getStringExtra("lawNature")
            }
        }

        // lawType
        if(requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                binding.selectLawType.text = data?.getStringExtra("lawType")
            }
        }

        // country
        if(requestCode == 3){
            if (resultCode == Activity.RESULT_OK){
                binding.selectCountry.text = data?.getStringExtra("hello")
            }
        }

        // state
        if(requestCode == 4){
            if (resultCode == Activity.RESULT_OK){
                binding.selectState.text = data?.getStringExtra("state")
            }
        }
    }
}