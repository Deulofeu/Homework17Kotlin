package com.example.homework17

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var valueCount: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valueCount = intent.getIntExtra("valueCount", 0)
        val textView = findViewById<TextView>(R.id.increase_counter)
        textView.setOnClickListener {
            valueCount++
            findViewById<TextView>(R.id.counter).text = valueCount.toString()
        }

        findViewById<TextView>(R.id.result).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("value", valueCount)
            startActivity(intent)
        }
    }
}