package com.example.lishtot.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lishtot.R
import com.example.lishtot.models.Language
import kotlinx.android.synthetic.main.layout_spinner.view.*

class SpinnerAdapter(context: Context, layout: Int, languages: Array<Language>) : ArrayAdapter<Language>(context, layout, languages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.layout_spinner, parent, false)

        var ivFlag = view!!.findViewById<ImageView>(R.id.iv_flag)
        view.findViewById<TextView>(R.id.tv_language).text = getItem(position)!!.language

        ivFlag.setImageResource(getItem(position)!!.flag)

        return super.getView(position, view, parent)
    }
}