package com.example.lishtot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.lishtot.R

class Screen15 : AppCompatActivity() {

    private lateinit var rbCreditCard: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen15)

        init()

    }

    private fun init() {
        findViews()

        rbCreditCard.isChecked = true
    }

    private fun findViews() {
        rbCreditCard = findViewById(R.id.rb_credit_card)
    }
}
