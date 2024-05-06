package com.example.imadassignment2_mybabyhuskey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bathroom2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bathroom2)

        val returnButton = findViewById<Button>(R.id.btnReturn5)                                    //(IIE,2024)

            returnButton.setOnClickListener {
                val intent = Intent(this, MainScreen::class.java)                      //(Github,2024),(OpenA.i,2024)
                startActivity(intent)

            }

        }
    }
