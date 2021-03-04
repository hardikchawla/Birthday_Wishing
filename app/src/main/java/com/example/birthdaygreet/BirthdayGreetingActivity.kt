package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val names = intent.getStringExtra(NAME_EXTRA)
        val birthdayGreetings = findViewById<TextView>(R.id.birthdayGreeting)

        birthdayGreetings.text = "Happy Birthday\n$names!"


    }
}