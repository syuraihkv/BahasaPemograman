package com.example.prepaidscreen

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons
        val btnPaketRumah: Button = findViewById(R.id.btnPaketRumah)
        val btnPaketKantor: Button = findViewById(R.id.btnPaketKantor)

        btnPaketRumah.setOnClickListener {
            Toast.makeText(this, "Paket Rumah dipilih", Toast.LENGTH_SHORT).show()
        }

        btnPaketKantor.setOnClickListener {
            Toast.makeText(this, "Paket Kantor dipilih", Toast.LENGTH_SHORT).show()
        }

        // Package Buttons Logic (example for one package button)
        val btnPesanDeluxe1: Button = findViewById(R.id.btnPesanDeluxe1)
        btnPesanDeluxe1.setOnClickListener {
            Toast.makeText(this, "Pesan Deluxe 1", Toast.LENGTH_SHORT).show()
        }
    }
}