package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Código para ocultar las barras de navegación y estado (si lo tienes)
            WindowCompat.setDecorFitsSystemWindows(window, false)
            val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
            windowInsetsController?.let {
                it.hide(WindowInsetsCompat.Type.navigationBars())
                it.hide(WindowInsetsCompat.Type.statusBars())
                it.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }

            // Temporizador para pasar al CarouselActivity después de 3 segundos (3000 milisegundos)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, CarouselActivity::class.java)
                startActivity(intent)
                finish() // Opcional: cierra PreInicioActivity para que no se pueda volver atrás fácilmente
            }, 3000) // Cambia el tiempo si es necesario
        }
    }