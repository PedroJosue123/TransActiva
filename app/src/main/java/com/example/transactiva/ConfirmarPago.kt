package com.example.transactiva

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmarPago : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_pago)

        val txtMonto = findViewById<TextView>(R.id.textMonto)
        val txtProducto = findViewById<TextView>(R.id.txtProducto)
        val txtProveedor = findViewById<TextView>(R.id.txtProveedor)
        val editOrigen = findViewById<EditText>(R.id.editOrigen)

        val producto = intent.getStringExtra("producto") ?: ""
        val proveedor = intent.getStringExtra("proveedor") ?: ""
        val monto = intent.getStringExtra("monto") ?: "0.00"

        txtProducto.text = "Producto: $producto"
        txtProveedor.text = "Proveedor: $proveedor"
        txtMonto.text = "S/ $monto"
        editOrigen.setText("")
    }
}
