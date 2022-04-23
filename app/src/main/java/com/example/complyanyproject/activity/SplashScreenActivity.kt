package com.example.complyanyproject.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.complyanyproject.MenuFragments.MenuFragment
import com.example.complyanyproject.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        lifecycleScope.launch(Dispatchers.Main){
            delay(3000)

            Intent(this@SplashScreenActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
            finish()
        }
    }


}