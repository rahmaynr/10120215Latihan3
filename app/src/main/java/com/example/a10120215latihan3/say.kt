package com.example.a10120215latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class say : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_say)

        val biodata = intent.getStringExtra("editText")
        val tampil = "Beres! Sekarang kamu\nudah bisa ngecek penggunaan HP mu\ntiap hari buat bantu kamu\nngatur waktu :)"
        Log.d("debug",tampil)
        val searchText = "kamu"
        val containsSearchText = tampil.contains(searchText)
        val replaceText = tampil.replace(searchText, biodata.toString(),false)
        val say = findViewById<TextView>(R.id.textView11)
        say.text = replaceText
    }
}