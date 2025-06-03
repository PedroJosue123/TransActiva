package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class EsperandoProveedor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esperando_proveedor)

        // Espera 4 segundos (4000 ms) antes de ir a la siguiente pantalla
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SolicitudAceptada::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}
