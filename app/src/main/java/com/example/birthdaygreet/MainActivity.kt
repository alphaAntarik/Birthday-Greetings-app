package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val t1= findViewById<EditText>(R.id.t1)

        button.setOnClickListener {

            val toast =Toast.makeText(applicationContext, "Generating BirthDay card", Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NameExtra,t1.editableText.toString())
            startActivity(intent)

        }
    }
}