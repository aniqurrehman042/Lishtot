package com.example.lishtot.ui

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.example.lishtot.R

class Screen23 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen23)

        findViewById<ImageView>(R.id.iv_menu_left).setImageResource(R.drawable.ic_arrow_left_white)
        findViewById<ImageView>(R.id.iv_menu_right).visibility = View.GONE
        findViewById<TextView>(R.id.tv_title).text = "Water Score Explanation"

        var dialog: Dialog = Dialog(this)
        dialog.setContentView(R.layout.layout_dialog_screen23)
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        dialog.window!!.setBackgroundDrawable(ResourcesCompat.getDrawable(resources, R.drawable.bg_trans, null))
        dialog.window!!.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
    }
}
