package com.example.order

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // Tab Jadwal dan Riwayat
        val tabJadwal: TextView = findViewById(R.id.tabJadwal)
        val tabRiwayat: TextView = findViewById(R.id.tabRiwayat)

        tabJadwal.setOnClickListener {
            Toast.makeText(this, "Tab Jadwal di-klik", Toast.LENGTH_SHORT).show()
        }

        tabRiwayat.setOnClickListener {
            Toast.makeText(this, "Tab Riwayat di-klik", Toast.LENGTH_SHORT).show()
        }
    }
}
