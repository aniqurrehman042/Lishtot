package com.example.lishtot.ui

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.lishtot.R

class Screen11 : AppCompatActivity() {

    private lateinit var spnLanguage: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen11)

        findViews()

        setUpSpinner()

    }

    private fun setUpSpinner() {
        var languages: Array<String> =
            Array(1) { "US English" }
        var spinnerAdapter: ArrayAdapter<String> = ArrayAdapter(this,
            R.layout.layout_spinner,
            R.id.tv_language, languages)
        spnLanguage.adapter = spinnerAdapter
    }

    private fun findViews() {
        spnLanguage = findViewById(R.id.spn_language)
    }
}
