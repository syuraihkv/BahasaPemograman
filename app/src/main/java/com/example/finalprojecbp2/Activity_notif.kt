package com.example.notifikasi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabTransaksi: TextView = findViewById(R.id.tabTransaksi)
        val tabUpdate: TextView = findViewById(R.id.tabUpdate)

        // Atur klik pada tab
        tabTransaksi.setOnClickListener {
            tabTransaksi.setBackgroundResource(android.R.color.white)
            tabUpdate.setBackgroundResource(android.R.color.darker_gray)
        }

        tabUpdate.setOnClickListener {
            tabUpdate.setBackgroundResource(android.R.color.white)
            tabTransaksi.setBackgroundResource(android.R.color.darker_gray)
        }
    }
}
