package com.example.imadassignment2_mybabyhuskey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreen : AppCompatActivity() {

    private var hungerPercentage = 50                                                               //(OpenAi,2024)
    private var cleanlinessPercentage = 50                                                          //(OpenAi,2024)
    private var happinessPercentage = 50                                                            //(OpenAi,2024)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val buttonFeed = findViewById<Button>(R.id.btnFeed)                                         //(IIE,2024)
        val buttonReturn = findViewById<Button>(R.id.btnReturn)                                     //(IIE,2024)
        val buttonPlay = findViewById<Button>(R.id.btnPlay)                                         //(IIE,2024)
        val buttonClean = findViewById<Button>(R.id.btnClean)                                       //(IIE,2024)
        val statusBar = findViewById<TextView>(R.id.statusBar)                                      //(IIE,2024)

        updateStatusBar(statusBar)

        buttonFeed.setOnClickListener {                                                      //(IIE,2024)
            hungerPercentage += 15                                                                  //(IIE,2024)
            if (hungerPercentage > 100) hungerPercentage = 100                                      //(IIE,2024)
            updateStatusBar(statusBar)                                                              //(OpenAI,2024)
            startActivity(Intent(this, KitchenScreen::class.java))                     //(Github,2024),(OpenAI,2024)
        }

        buttonPlay.setOnClickListener {                                                      //(IIE,2024)
            happinessPercentage += 20                                                               //(IIE,2024)
            if (happinessPercentage > 100) happinessPercentage = 100                                //(IIE,2024)
            updateStatusBar(statusBar)                                                              //(OpenAi,2024)
            startActivity(Intent(this, Play::class.java))                              //(Github,2024),(OpenAi,2024)
        }

        buttonClean.setOnClickListener {                                                     //(IIE,2024)
            cleanlinessPercentage += 15                                                             //(IIE,2024)
            if (cleanlinessPercentage > 100) cleanlinessPercentage = 100                            //(IIE,2024)
            updateStatusBar(statusBar)                                                              //(OpenA.I,2024)
            startActivity(Intent(this, Bathroom1::class.java))                         //OpenAi,2024)
        }

        buttonReturn.setOnClickListener {                                                    //(IIE,2024)
            startActivity(Intent(this, MainActivity::class.java))                      //(Github,2024),(OpenAi,2024)
        }
    }

    private fun updateStatusBar(statusBar: TextView) {                                              //(OpenAi,2024)
        val healthPercentage = (hungerPercentage + cleanlinessPercentage + happinessPercentage) / 3 //(openAi,2024)
        statusBar.text = "Health: $healthPercentage%\nHunger: $hungerPercentage%\nCleanliness: $cleanlinessPercentage%" //(OpenAi,2024)
    }
}
