package com.example.a10120215latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class login : AppCompatActivity() {
    private lateinit var btn_login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login = findViewById(R.id.btn_login)
        btn_login.setOnClickListener{
            val intent = Intent(this, biodata::class.java)
            startActivity(intent)
        }
    }

    fun onClickMyButton(view: View) {}
}
