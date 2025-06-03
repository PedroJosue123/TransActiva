package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.text.Html
import android.text.Spanned
import android.widget.Button // Importa la clase Button
import android.os.Build

class InicioLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtén una referencia al TextView que muestra el mensaje de Sign Up
        val signUpMessageTextView: TextView = findViewById(R.id.forgot_password)
        // Formatea la cadena HTML
        @Suppress("DEPRECATION")
        val formattedText: Spanned = Html.fromHtml(getString(R.string.login_signup_message))
        // Establece el texto formateado en el TextView
        signUpMessageTextView.text = formattedText

        // Obtén una referencia al botón Log In
        val loginButton: Button = findViewById(R.id.login_button)
        // Setea un OnClickListener para iniciar la LoginActivity
        loginButton.setOnClickListener {
            val intent = Intent(this, Login::class.java) // Asegúrate de que LoginActivity sea el nombre correcto de tu clase Kotlin
            startActivity(intent)
        }
    }
}