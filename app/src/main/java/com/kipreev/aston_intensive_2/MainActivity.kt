package com.kipreev.aston_intensive_2

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kipreev.aston_intensive_2.saveInstanceState.MainActivity

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToast: Button = findViewById(R.id.button_toast)
        val buttonCount: Button = findViewById(R.id.button_count)
        val buttonZero: Button = findViewById(R.id.button_zero)
        val showCount: TextView = findViewById(R.id.show_count)
        val buttonNextLessonScrollView: Button = findViewById(R.id.btn_next_lesson)
        val buttonNextLessonIntent: Button = findViewById(R.id.btn_next_lesson_intent)
        val buttonLessonSavedInstState: Button =
            findViewById(R.id.button_next_lesson_saved_instance_state)
        val buttonLessonImplIntents: Button = findViewById(R.id.next_lesson_implicit_intents)

        buttonToast.setOnClickListener {
            showToast(it)
        }

        buttonCount.setOnClickListener {
            mCount++
            showCount.text = mCount.toString()
            if (mCount > 0) {
                buttonZero.setBackgroundColor(Color.RED)
            }
        }

        buttonZero.setOnClickListener {
            showCount.text = "0"
            mCount = 0
            buttonZero.setBackgroundColor(Color.GRAY)
        }

        buttonNextLessonScrollView.setOnClickListener {
            val intent = Intent(this, ScrollViewActivity::class.java)
            startActivity(intent)
        }

        buttonNextLessonIntent.setOnClickListener {
            val intent =
                Intent(this, com.kipreev.aston_intensive_2.two_activity.MainActivity::class.java)
            startActivity(intent)
        }

        buttonLessonSavedInstState.setOnClickListener {
            val intent = Intent(
                this,
                com.kipreev.aston_intensive_2.saveInstanceState.MainActivity::class.java
            )
            startActivity(intent)
        }

        buttonLessonImplIntents.setOnClickListener {
            val intent = Intent(
                this,
                com.kipreev.aston_intensive_2.implicit_intents.MainActivity::class.java
            )
            startActivity(intent)
        }

    }

    private fun showToast(view: View) {
        Toast.makeText(this, "You tap a button Toast", Toast.LENGTH_SHORT).show()
    }

    companion object {
        private const val TAG = "MainActivity"
    }


}
