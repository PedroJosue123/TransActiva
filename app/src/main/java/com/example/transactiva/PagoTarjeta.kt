package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PagoTarjeta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pago_tarjeta)

        val editMonto = findViewById<EditText>(R.id.editMonto)
        val editNumeroTarjeta = findViewById<EditText>(R.id.editNumeroTarjeta)
        val editFecha = findViewById<EditText>(R.id.editFecha)
        val editCVV = findViewById<EditText>(R.id.editCVV)
        val btnPagar = findViewById<Button>(R.id.btnPagar)

        val producto = intent.getStringExtra("producto") ?: ""
        val proveedor = intent.getStringExtra("proveedor") ?: ""
        val montoInicial = intent.getStringExtra("monto") ?: ""
        editMonto.setText(montoInicial)

        btnPagar.setOnClickListener {
            val monto = editMonto.text.toString().trim()
            val tarjeta = editNumeroTarjeta.text.toString().trim()
            val fecha = editFecha.text.toString().trim()
            val cvv = editCVV.text.toString().trim()

            if (monto.isEmpty() || tarjeta.isEmpty() || fecha.isEmpty() || cvv.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Pago de S/$monto procesado correctamente", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ConfirmarPago::class.java)
            intent.putExtra("monto", monto)
            intent.putExtra("producto", producto)
            intent.putExtra("proveedor", proveedor)
            startActivity(intent)
        }
    }
}
