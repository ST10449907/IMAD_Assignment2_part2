package com.example.imadassignment2_mybabyhuskey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart = findViewById<Button>(R.id.getStartedBtn)                                  //IIE,2024
        buttonStart.setOnClickListener {                                                     //IIE,2024
            val intent = Intent(this, MainScreen::class.java)                          //(OpenA.i,2024)
            startActivity(intent)
        }
    }
}
