package com.example.portofolio_catchy_travel_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class ProfilerActivity : AppCompatActivity() {
    private lateinit var tvTitleProfiler:TextView
    private lateinit var tvDescProfiler:TextView
    private lateinit var tvEverSignIn:TextView
    private lateinit var txtDiv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiler)
        tvTitleProfiler = findViewById(R.id.txt_title_profiler)
        tvDescProfiler = findViewById(R.id.tv_desc_profiler)
        tvEverSignIn = findViewById(R.id.tv_ever_sign_in)
        txtDiv = findViewById(R.id.txt_div)

        tvTitleProfiler.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        tvDescProfiler.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        tvEverSignIn.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        txtDiv.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_medium)
    }
}