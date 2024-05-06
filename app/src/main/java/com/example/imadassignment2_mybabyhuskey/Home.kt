package com.example.imadassignment2_mybabyhuskey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val buttonFeed = findViewById<Button>(R.id.btnFeed)                                         //IIE,2024
        val buttonReturn = findViewById<Button>(R.id.btnReturn)                                     //IIE,2024
        val buttonPlay = findViewById<Button>(R.id.btnPlay)                                         //IIE,2024
        val buttonClean = findViewById<Button>(R.id.btnClean)                                       //IIE,2024

        buttonClean.setOnClickListener {                                                     //IIE,2024
            val intent = Intent(this, Bathroom1::class.java)                           //(OpenA.i,2024)
            startActivity(intent)
        }

        buttonPlay.setOnClickListener {
            val intent = Intent(this, Play::class.java)                                //(OpenA.i,2024)
            startActivity(intent)
        }

        buttonFeed.setOnClickListener {
            val intent = Intent(this, KitchenScreen::class.java)                       //(OpenA.i,2024)
            startActivity(intent)
        }

        buttonReturn.setOnClickListener {                                                    //IIE,2024
            val intent = Intent(this, MainActivity::class.java)                        //(OpenAI,2024)
            startActivity(intent)                                                                   //OpenAi,2024
        }
    }
}
