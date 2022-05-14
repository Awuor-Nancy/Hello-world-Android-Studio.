package com.example.first_helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnSend:Button
    lateinit var btnBMA:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent = Intent(this,BMICalculate::class.java)
            startActivity(intent)
        }
        btnSend = findViewById (R.id.btnSend)
        btnSend.setOnClickListener {
            val intent = Intent(this,sendCash::class.java)
            startActivity(intent)
        }
        btnBMA=findViewById(R.id.btnBMA)
        btnBMA.setOnClickListener {
            val intent = Intent(this,BMICalculate::class.java)
            startActivity(intent)
        }

    }
}