package com.serpa.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var mHelloTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mHelloTextView = findViewById(R.id.textView)

        var imageButton : ImageButton = findViewById(R.id.imageButton)
        var editText : EditText = findViewById(R.id.editTextTextPersonName)
        var textView : TextView = findViewById(R.id.textView)

        //Click listener
        imageButton.setOnClickListener {

            textView.text = when ("" + editText.text) {
                "" ->  "Hello, Kitty!"
                else -> "Hello, " + editText.text + "!"
            }
        }
    }
}