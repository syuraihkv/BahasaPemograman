package com.example.finalprojecbp2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    companion object {
        var name = "Anwar Syafii"
        var email = "afan@gmail.com"
        var password = "admiin#123"
        var member = "silver"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Mendapatkan referensi ke elemen UI
        val txtEmail: EditText = findViewById(R.id.inputEmail)
        val txtPassword: EditText = findViewById(R.id.inputPassword)
        val btnSignIn: Button = findViewById(R.id.btnLogin)

        // Handle klik tombol login
        btnSignIn.setOnClickListener {
            if (txtEmail.text.toString() == email && txtPassword.text.toString() == password) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "Login Gagal, Periksa kembali email dan password Anda",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
