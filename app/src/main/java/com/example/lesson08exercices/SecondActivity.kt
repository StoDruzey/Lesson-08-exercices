package com.example.lesson08exercices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson08exercices.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivitySecondBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                textView.text = intent.getStringExtra("key_text")
            }
    }
}