package com.example.a10120215latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {
    private lateinit var btnMasuk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMasuk = findViewById(R.id.btn_masuk)
        btnMasuk.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }

    fun onClickMyButton(view: View) {}
}
