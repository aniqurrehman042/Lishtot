package com.example.lishtot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.lishtot.R
import com.example.lishtot.adapters.HistoryAdapter
import com.example.lishtot.models.History

class Screen35 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen35)

        findViewById<View>(R.id.v_shadow).visibility = View.GONE

        findViewById<ImageView>(R.id.iv_menu_left).setImageResource(R.drawable.ic_arrow_left_white)
        findViewById<ImageView>(R.id.iv_menu_right).visibility = View.GONE
        findViewById<TextView>(R.id.tv_title).text = "History"

        val historyArray = Array<History>(3) { History("12.07.2019", 53, "This is the comment section") }

        historyArray[1] = History("29.08.2019", 59, "This is the comment section")
        historyArray[2] = History("17.10.2019", 68, "This is the comment section")

        val lvHistory: ListView = findViewById(R.id.lv_history)
        val historyAdapter: HistoryAdapter = HistoryAdapter(this, R.layout.layout_history_list_item, R.id.tv_date, historyArray)
        lvHistory.adapter = historyAdapter


    }
}
