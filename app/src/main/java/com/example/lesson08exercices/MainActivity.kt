package com.example.lesson08exercices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson08exercices.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                button.setOnClickListener {
                    val intent =Intent(this@MainActivity, SecondActivity::class.java)
                        .putExtra("key_text", Random.nextBoolean().toString())
                    this@MainActivity.startActivity(intent)
                }
            }
    }
}