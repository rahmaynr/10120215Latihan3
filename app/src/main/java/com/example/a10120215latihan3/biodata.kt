package com.example.a10120215latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class biodata : AppCompatActivity() {
    private lateinit var btn_selanjutnya: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        btn_selanjutnya = findViewById(R.id.btn_selanjutnya)
        btn_selanjutnya.setOnClickListener {
            val biodata = findViewById<EditText>(R.id.editText).text.toString()
            val intent = Intent(this, say::class.java)
            intent.putExtra("editText",biodata)
            startActivity(intent)
        }
    }
}