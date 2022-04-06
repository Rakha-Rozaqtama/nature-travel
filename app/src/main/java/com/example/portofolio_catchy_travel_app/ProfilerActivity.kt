package com.example.portofolio_catchy_travel_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class ProfilerActivity : AppCompatActivity() {
    private lateinit var tvTitleProfiler:TextView
    private lateinit var tvDescProfiler:TextView
    private lateinit var tvEverSignIn:TextView
    private lateinit var txtSignInGoogle:TextView
    private lateinit var txtSignInFB:TextView
    private lateinit var txtDiv:TextView
    private lateinit var txtHeaderManual:TextView
    private lateinit var inputEmail:EditText
    private lateinit var inputPassword:EditText
    private lateinit var showPass:CheckBox
    private lateinit var btnSignIn:Button
    private lateinit var txtCopyright:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiler)
        tvTitleProfiler = findViewById(R.id.txt_title_profiler)
        tvDescProfiler = findViewById(R.id.tv_desc_profiler)
        tvEverSignIn = findViewById(R.id.tv_ever_sign_in)
        txtSignInGoogle = findViewById(R.id.txt_sign_google)
        txtSignInFB = findViewById(R.id.txt_sign_facebook)
        txtDiv = findViewById(R.id.txt_div)
        txtHeaderManual = findViewById(R.id.txt_header_manual_sign_in)
        inputEmail = findViewById(R.id.input_email)
        inputPassword = findViewById(R.id.input_password)
        showPass = findViewById(R.id.show_password)
        btnSignIn = findViewById(R.id.btn_sign_in)
        txtCopyright = findViewById(R.id.txt_copyright)


        tvTitleProfiler.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        tvDescProfiler.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        tvEverSignIn.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        txtDiv.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_medium)
        txtDiv.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        txtHeaderManual.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        txtCopyright.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_bold)
        txtSignInGoogle.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        txtSignInFB.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        showPass.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        inputEmail.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        inputPassword.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        btnSignIn.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)
        txtCopyright.typeface = ResourcesCompat.getFont(this, R.font.ubuntu_regular)

        showPass.setOnClickListener {
            togglePassword();
        }
    }

    private fun togglePassword(){
        if(showPass.isChecked){
            inputPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        }else{
            inputPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
        }
    }
}