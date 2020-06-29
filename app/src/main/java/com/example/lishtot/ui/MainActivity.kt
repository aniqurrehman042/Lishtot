package com.example.lishtot.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lishtot.R

class MainActivity : AppCompatActivity() {

    private lateinit var btnScreen8: Button
    private lateinit var btnScreen10: Button
    private lateinit var btnScreen11: Button
    private lateinit var btnScreen12: Button
    private lateinit var btnScreen13: Button
    private lateinit var btnScreen14: Button
    private lateinit var btnScreen15: Button
    private lateinit var btnScreen16: Button
    private lateinit var btnScreen21: Button
    private lateinit var btnScreen23: Button
    private lateinit var btnScreen25: Button
    private lateinit var btnScreen27: Button
    private lateinit var btnScreen30: Button
    private lateinit var btnScreen34: Button
    private lateinit var btnScreen35: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews()

        setListners()
    }

    private fun setListners() {
        btnScreen8.setOnClickListener {
            startActivity(Screen8::class.java)
        }

        btnScreen10.setOnClickListener {
            startActivity(Screen10::class.java)
        }

        btnScreen11.setOnClickListener {
            startActivity(Screen11::class.java)
        }

        btnScreen12.setOnClickListener {
            startActivity(Screen12::class.java)
        }

        btnScreen13.setOnClickListener {
            startActivity(Screen13::class.java)
        }

        btnScreen14.setOnClickListener {
            startActivity(Screen14::class.java)
        }

        btnScreen15.setOnClickListener {
            startActivity(Screen15::class.java)
        }

        btnScreen16.setOnClickListener {
            startActivity(Screen16::class.java)
        }

        btnScreen21.setOnClickListener {
            startActivity(Screen21::class.java)
        }

        btnScreen23.setOnClickListener {
            startActivity(Screen23::class.java)
        }

        btnScreen25.setOnClickListener {
            startActivity(Screen25::class.java)
        }

        btnScreen27.setOnClickListener {
            startActivity(Screen27::class.java)
        }

        btnScreen30.setOnClickListener {
            startActivity(Screen30::class.java)
        }

        btnScreen34.setOnClickListener {
            startActivity(Screen34::class.java)
        }

        btnScreen35.setOnClickListener {
            startActivity(Screen35::class.java)
        }
    }

    private fun findViews() {
        btnScreen8 = findViewById(R.id.btn_screen_8)
        btnScreen10 = findViewById(R.id.btn_screen_10)
        btnScreen11 = findViewById(R.id.btn_screen_11)
        btnScreen12 = findViewById(R.id.btn_screen_12)
        btnScreen13 = findViewById(R.id.btn_screen_13)
        btnScreen14 = findViewById(R.id.btn_screen_14)
        btnScreen15 = findViewById(R.id.btn_screen_15)
        btnScreen16 = findViewById(R.id.btn_screen_16)
        btnScreen21 = findViewById(R.id.btn_screen_21)
        btnScreen23 = findViewById(R.id.btn_screen_23)
        btnScreen25 = findViewById(R.id.btn_screen_25)
        btnScreen27 = findViewById(R.id.btn_screen_27)
        btnScreen30 = findViewById(R.id.btn_screen_30)
        btnScreen34 = findViewById(R.id.btn_screen_34)
        btnScreen35 = findViewById(R.id.btn_screen_35)
    }

    private fun startActivity(activityClass: Class<*>) {
        var intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
