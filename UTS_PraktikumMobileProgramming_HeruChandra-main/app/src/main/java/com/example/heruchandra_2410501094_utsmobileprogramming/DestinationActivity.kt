package com.example.heruchandra_2410501094_utsmobileprogramming

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        val btnKembali: Button = findViewById(R.id.btnKembali)

        btnKembali.setOnClickListener {
            finish()
        }
    }
}