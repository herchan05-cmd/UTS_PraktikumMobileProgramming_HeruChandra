package com.example.heruchandra_2410501094_utsmobileprogramming

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Jeda 5 detik lalu pindah ke halaman Makanan Favorit
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
            finish() // Menutup Splash Screen
        }, 5000)
    }
}