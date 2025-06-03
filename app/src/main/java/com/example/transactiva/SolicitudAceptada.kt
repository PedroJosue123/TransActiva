package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SolicitudAceptada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solicitud_aceptada)

        val btnIrAPagar = findViewById<TextView>(R.id.btnIrAPagar)

        btnIrAPagar.setOnClickListener {
            val intent = Intent(this, IngresoPin::class.java)
            startActivity(intent)
            finish() // opcional
        }
    }
}
