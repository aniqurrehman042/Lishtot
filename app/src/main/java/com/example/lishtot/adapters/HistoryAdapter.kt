package com.example.lishtot.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.lishtot.R
import com.example.lishtot.models.History

class HistoryAdapter(context: Context, layout: Int, textview: Int, var histories: Array<History>) :
    ArrayAdapter<History>(context, layout) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view: View

        if (convertView == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_history_list_item, parent, false)
        } else {
            view = convertView
        }

        val tvDate: TextView = view.findViewById<TextView>(R.id.tv_date)
        val tvScore: TextView = view.findViewById<TextView>(R.id.tv_score)
        val tvComment: TextView = view.findViewById<TextView>(R.id.tv_comment)
        val llMain: LinearLayout = view.findViewById(R.id.ll_main)

        if (position % 2 == 0)
            llMain.setBackgroundColor(ContextCompat.getColor(parent.context, R.color.lightest_grey))
        else
            llMain.setBackgroundColor(ContextCompat.getColor(parent.context, R.color.white))

        val history: History? = getItem(position)

        if (history != null) {
            tvDate.text = history.date
            tvScore.text = history.score.toString()
            tvComment.text = history.comment

            if (history.score < 65)
                tvScore.setTextColor(
                    ContextCompat.getColor(
                        parent.context,
                        android.R.color.holo_red_light
                    )
                )
            else
                tvScore.setTextColor(
                    ContextCompat.getColor(
                        parent.context,
                        android.R.color.holo_orange_dark
                    )
                )
        }

        return view
    }

    override fun getItem(position: Int): History? {
        return histories[position]
    }

    override fun getCount(): Int {
        return histories.size
    }

}