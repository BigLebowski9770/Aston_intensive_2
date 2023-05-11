package com.kipreev.aston_intensive_2.saveInstanceState

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kipreev.aston_intensive_2.R

class MainActivity : AppCompatActivity() {
    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saveinstancestate_activity_main)

        val showCount: TextView = findViewById(R.id.show_count)
        val buttonCount: Button = findViewById(R.id.button_count)

        buttonCount.setOnClickListener {
            mCount++
            showCount.text = mCount.toString()
        }

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(KEY_COUNT, 0)
            showCount.text = mCount.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNT, mCount)
    }

    companion object {
        private const val KEY_COUNT = "COUNT"
    }

}
