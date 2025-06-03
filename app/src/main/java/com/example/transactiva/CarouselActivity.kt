package com.example.transactiva

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class CarouselActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousel)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val slideLayouts = listOf(
            R.layout.slide_page_1,
            R.layout.slide_page_2,
            R.layout.slide_page_3,
            R.layout.slide_page_4
        )

        val adapter = CarouselPagerAdapter(slideLayouts)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                // Cuando se selecciona la última página, inicia la LoginActivity
                if (position == slideLayouts.size - 1) {
                    // Espera un breve momento antes de iniciar la siguiente Activity
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(this@CarouselActivity, InicioLogin::class.java)
                        startActivity(intent)
                        finish() // Opcional: cierra CarouselActivity
                    }, 1500) // Espera 1.5 segundos (ajusta si es necesario)
                }
            }
        })
    }
}