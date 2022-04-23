package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivitySelectorClientSubGroupBinding

class SelectorClientSubGroupActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySelectorClientSubGroupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectorClientSubGroupBinding.inflate(layoutInflater)
        setContentView(binding.root)





//        with(txt1) {
//            this?.setOnClickListener(View.OnClickListener {
//
//                val str = txt1.text.toString()
//                val intent = Intent(applicationContext, CreateClientSubGroupActivity::class.java)
//                intent.putExtra("message_key", str)
//                startActivity(intent)
//                finish()
//            })
//        }
//
//        with(txt2) {
//            this?.setOnClickListener(View.OnClickListener {
//
//                val str = txt2.text.toString()
//                val intent = Intent(applicationContext, CreateClientSubGroupActivity::class.java)
//                intent.putExtra("message_key", str)
//                startActivity(intent)
//                finish()
//            })
//        }
//        with(txt3) {
//            this?.setOnClickListener(View.OnClickListener {
//
//                val str = txt3.text.toString()
//                val intent = Intent(applicationContext, CreateClientSubGroupActivity::class.java)
//                intent.putExtra("message_key", str)
//                startActivity(intent)
//                finish()
//            })
//        }

        binding.txt1.setOnClickListener {
            val intent = Intent()
            intent.putExtra("clientSubGroup", binding.txt1.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.txt2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("clientSubGroup", binding.txt2.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        binding.txt3.setOnClickListener {
            val intent = Intent()
            intent.putExtra("clientSubGroup", binding.txt3.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }


        binding.backSelector.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}