package com.example.lishtot.ui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.lishtot.R
import com.github.anastr.speedviewlib.SpeedView

// 10 -13, 27, 8, 14, 15, 16, 21, 23, 25, 30, 34, 35

class Screen8 : AppCompatActivity() {

    private lateinit var spdvScore: SpeedView
    private lateinit var dlDrawer: DrawerLayout
    private lateinit var llMenuLeft: LinearLayout
    private lateinit var ivMenuLeft: ImageView

    private var drawerOpen: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen8)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_INHERIT);

        init()

    }

    private fun init() {
        findViews()
        setUpToolbarAndDrawer()
        setListeners()

        setUpSpeedView()
    }

    private fun setListeners() {
        dlDrawer.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerStateChanged(newState: Int) {

            }

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {

            }

            override fun onDrawerClosed(drawerView: View) {
                menuClick()
                drawerOpen = false
            }

            override fun onDrawerOpened(drawerView: View) {
                menuClick()
                drawerOpen = true
            }
        })

        llMenuLeft.setOnClickListener {
            menuClick()
        }
    }

    private fun menuClick() {
        if (drawerOpen) {
            dlDrawer.closeDrawer(GravityCompat.START)
            ivMenuLeft.setImageResource(R.drawable.ic_menu_white)
        } else {
            dlDrawer.openDrawer(GravityCompat.START)
            ivMenuLeft.setImageResource(R.drawable.ic_close_white)
        }
    }

    private fun setUpToolbarAndDrawer() {

    }

    private fun setUpSpeedView() {
        spdvScore.speedTo(67f, 1200)
    }

    private fun findViews() {
        spdvScore = findViewById(R.id.spdv_score)
        dlDrawer = findViewById(R.id.dl_drawer)
        llMenuLeft = findViewById(R.id.ll_menu_left)
        ivMenuLeft = findViewById(R.id.iv_menu_left)
    }
}
