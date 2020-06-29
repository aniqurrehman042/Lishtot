package com.example.lishtot.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.lishtot.R

class Screen10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen10)

        Handler().postDelayed(Runnable {
            var intent = Intent(this@Screen10, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

    }
}
