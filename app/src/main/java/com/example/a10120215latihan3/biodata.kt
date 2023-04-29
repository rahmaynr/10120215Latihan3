package com.example.a10120215latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class biodata : AppCompatActivity() {
    private lateinit var btn_selanjutnya: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        btn_selanjutnya = findViewById(R.id.btn_selanjutnya)
        btn_selanjutnya.setOnClickListener {
            val intent = Intent(this, say::class.java)
            startActivity(intent)
        }
    }
}