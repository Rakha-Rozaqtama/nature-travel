package com.example.portofolio_catchy_travel_app

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

@SuppressLint("CustomSplashScreen")
@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    private lateinit var appTitle:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        appTitle = findViewById(R.id.app_title)
        appTitle.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)

        Handler().postDelayed({
            val intentToMain = Intent(this, ProfilerActivity::class.java)
            startActivity(intentToMain)
            finish()
        }, 5000)
    }
}