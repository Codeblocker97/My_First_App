package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val passwordGenerator = PasswordGenerator()



    private var password: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val passwordGeneratorButton: Button = findViewById<Button>(R.id.generate_password_button)
        val passwordGeneratorTextView: TextView = findViewById<TextView>(R.id.generate_password_textView)
        passwordGeneratorButton.setOnClickListener {
            passwordGeneratorButton.setBackgroundColor(Color.RED)
            passwordGeneratorTextView.setBackgroundColor(Color.YELLOW)
            password = passwordGenerator.generatePassword(12, "Developer")
            passwordGeneratorTextView.text = password
        }
    }
}
