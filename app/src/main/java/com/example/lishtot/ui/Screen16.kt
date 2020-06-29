package com.example.lishtot.ui

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.content.res.ResourcesCompat
import com.example.lishtot.R

class Screen16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen16)

        var dialog: Dialog = Dialog(this)
        dialog.setContentView(R.layout.layout_dialog_screen16)
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        dialog.window!!.setBackgroundDrawable(ResourcesCompat.getDrawable(resources, R.drawable.bg_trans, null))
        dialog.window!!.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.window!!.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
    }
}
