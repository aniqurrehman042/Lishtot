package com.example.lishtot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import com.example.lishtot.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class Screen25 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen25)

        findViewById<ImageView>(R.id.iv_menu_left).visibility = View.GONE

        var bottomSheetDialog: BottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.layout_bottom_dialog_screen25)
        bottomSheetDialog.setCanceledOnTouchOutside(false)
        bottomSheetDialog.show()
//        bottomSheetDialog.window!!.setBackgroundDrawable(ResourcesCompat.getDrawable(resources, R.drawable.bg_trans, null))
        bottomSheetDialog.window!!.findViewById<View>(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent)
        bottomSheetDialog.window!!.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)

    }
}
