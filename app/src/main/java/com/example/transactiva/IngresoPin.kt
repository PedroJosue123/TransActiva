package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IngresoPin : AppCompatActivity() {

    private lateinit var editPin: EditText
    private val pinBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso_pin)

        editPin = findViewById(R.id.editPin)

        val buttons = listOf(
            R.id.btn0 to "0", R.id.btn1 to "1", R.id.btn2 to "2",
            R.id.btn3 to "3", R.id.btn4 to "4", R.id.btn5 to "5",
            R.id.btn6 to "6", R.id.btn7 to "7", R.id.btn8 to "8",
            R.id.btn9 to "9"
        )

        buttons.forEach { (id, digit) ->
            findViewById<TextView>(id).setOnClickListener {
                if (pinBuilder.length < 6) {
                    pinBuilder.append(digit)
                    editPin.setText("*".repeat(pinBuilder.length))
                    if (pinBuilder.length == 6) {
                        // Aquí cambias a la siguiente pantalla
                        val intent = Intent(this, PagoTarjeta::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }
}
