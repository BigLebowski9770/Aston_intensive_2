package com.kipreev.aston_intensive_2.two_activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kipreev.aston_intensive_2.R


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.kipreev.aston_intensive_2.R.layout.two_activity_second)
        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.count_of_click_intent)
        textView.text = message
    }
}
