package com.example.imadassignment2_mybabyhuskey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Play : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val btnPlay = findViewById<Button>(R.id.btnPlay1)                                           //IIE,2024
        val returnButton = findViewById<Button>(R.id.btnReturn3)                                    //IIE,2024

        btnPlay.setOnClickListener {
            val intent = Intent(this, Play1::class.java)                               //(OpenA.i,2024)
            startActivity(intent)

        returnButton.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)                          //(OpenA.i,2024)
            startActivity(intent)

            }

        }
    }
}