package com.kipreev.aston_intensive_2.two_activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kipreev.aston_intensive_2.R

class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private lateinit var countInTwoActivity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.two_activity_main)
        val buttonSayHello: Button = findViewById(R.id.button_say_hello)
        val buttonCount: Button = findViewById(R.id.button_count)
        countInTwoActivity = findViewById(R.id.count_in_two_activ)

        buttonCount.setOnClickListener {
            mCount++
            countInTwoActivity.text = mCount.toString()
        }

        buttonSayHello.setOnClickListener {
            launchSecondActivity(it)
        }

    }


    private fun launchSecondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val message = countInTwoActivity.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    companion object {
        const val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    }
}

