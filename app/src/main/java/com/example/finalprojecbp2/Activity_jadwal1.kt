package com.example.pilihjadwal

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PilihJadwalActivity : AppCompatActivity() {

    private lateinit var tvSelectedDate: TextView
    private lateinit var calendarView: CalendarView
    private lateinit var btnAturJadwal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_jadwal)

        // Inisialisasi view
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        calendarView = findViewById(R.id.calendarView)
        btnAturJadwal = findViewById(R.id.btnAturJadwal)

        // Tampilkan tanggal yang dipilih di CalendarView
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            tvSelectedDate.text = "Ketersediaan Jam Tanggal $selectedDate"
        }

        // Tombol atur jadwal
        btnAturJadwal.setOnClickListener {
            Toast.makeText(this, "Jadwal berhasil diatur!", Toast.LENGTH_SHORT).show()
        }
    }
}
