package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroPedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_pedido)

        val producto = findViewById<EditText>(R.id.editProducto)
        val cantidad = findViewById<EditText>(R.id.editCantidad)
        val estado = findViewById<EditText>(R.id.editEstado)
        val proveedor = findViewById<EditText>(R.id.editProveedor)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val prod = producto.text.toString().trim()
            val cant = cantidad.text.toString().trim()
            val est = estado.text.toString().trim()
            val prov = proveedor.text.toString().trim()

            if (prod.isEmpty() || cant.isEmpty() || est.isEmpty() || prov.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos para continuar", Toast.LENGTH_SHORT).show()
            } else {
                // Aquí enviamos los datos a la siguiente pantalla
                val intent = Intent(this, EsperandoProveedor::class.java).apply {
                    putExtra("producto", prod)
                    putExtra("cantidad", cant)
                    putExtra("estado", est)
                    putExtra("proveedor", prov)
                }
                startActivity(intent)
                finish()
            }
        }
    }
}
