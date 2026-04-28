package com.example.heruchandra_2410501094_utsmobileprogramming

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val btnDestinasi: Button = findViewById(R.id.btnDestinasi)

        btnDestinasi.setOnClickListener {
            val intent = Intent(this, DestinationActivity::class.java)
            startActivity(intent)
        }
    }
}