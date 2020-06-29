package com.example.lishtot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.lishtot.R

class Screen21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen21)

        findViewById<ImageView>(R.id.iv_menu_left).setImageResource(R.drawable.ic_arrow_left_white)
        findViewById<ImageView>(R.id.iv_menu_right).visibility = View.GONE
        findViewById<TextView>(R.id.tv_title).text = "Water Score Explanation"
    }
}
