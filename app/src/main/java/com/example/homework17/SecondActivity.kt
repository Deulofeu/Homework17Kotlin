package com.example.homework17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private var valueCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        valueCount = intent.getIntExtra("value",0)
        findViewById<TextView>(R.id.value_number).text = valueCount.toString()
    }
}