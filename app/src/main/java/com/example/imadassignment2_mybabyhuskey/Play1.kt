package com.example.imadassignment2_mybabyhuskey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Play1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play1)

        val returnButton = findViewById<Button>(R.id.btnReturn4)                                    //IIE,2024

        returnButton.setOnClickListener {                                                    //IIE,2024
            val intent = Intent(this, MainScreen::class.java)                          //(OpenA.i,2024)
            startActivity(intent)

        }
    }
}