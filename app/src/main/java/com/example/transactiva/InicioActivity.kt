package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val fab = findViewById<FloatingActionButton>(R.id.btnAdd)
        fab.setOnClickListener {
            val intent = Intent(this, RegistroPedido::class.java)
            startActivity(intent)
        }
    }
}
