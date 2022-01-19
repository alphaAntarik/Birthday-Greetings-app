package com.example.birthdaygreet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NameExtra = "NameInput"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val bgreet = findViewById<TextView>(R.id.birthdayGreet)
        val name = intent.getStringExtra("NameInput")
        bgreet.text = "Happy Birthday\n$name!"

    }
}