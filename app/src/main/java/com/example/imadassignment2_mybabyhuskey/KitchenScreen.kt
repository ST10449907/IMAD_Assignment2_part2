package com.example.imadassignment2_mybabyhuskey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class KitchenScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen_screen)

        val btnFeedScreen = findViewById<Button>(R.id.btnfeed2)                                     //(IIE,2024)
        val btnReturn = findViewById<Button>(R.id.btnReturn1)                                       //(IIE,2024)

        btnFeedScreen.setOnClickListener {
            val intent = Intent(this, KitchenScreen1::class.java)                      //(OpenA.i,2024)
            startActivity(intent)                                                                   //(Github,2024),(OpenA.i,2024)

        }

        btnReturn.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)                          //(Github,2024),(OpenA.i,2024)
            startActivity(intent)                                                                   //(Github,2024),(OpenA.i,2024)

            }

        }
    }

