package com.example.hubungikami

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HubungiKamiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hubungi_kami)

        // Tombol Live Chat
        val liveChatButton: Button = findViewById(R.id.liveChatButton)

        liveChatButton.setOnClickListener {
            // Tampilkan pesan saat tombol Live Chat diklik
            Toast.makeText(this, "Live Chat dibuka", Toast.LENGTH_SHORT).show()
        }

        // Tab Chat Order
        val chatOrderTab: TextView = findViewById(R.id.chatOrderTab)
        chatOrderTab.setOnClickListener {
            // Tampilkan pesan jika diperlukan
            Toast.makeText(this, "Chat Order Tab", Toast.LENGTH_SHORT).show()
        }
    }
}
