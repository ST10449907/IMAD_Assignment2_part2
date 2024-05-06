package com.example.imadassignment2_mybabyhuskey

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bathroom1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bathroom1)

        val buttonClean = findViewById<Button>(R.id.btnClean3)                                      //IIE,2024
        val buttonReturn = findViewById<Button>(R.id.btnReturn5)                                    //IIE,2024

        buttonClean.setOnClickListener {                                                     //IIE,2024

            buttonClean.setOnClickListener {
                val intent = Intent(this, Bathroom2::class.java)                       //(Github,2024),(OpenA.i,2024)
                startActivity(intent)                                                               //(Github,2024),(OpenA.i,2024)
            }

            buttonReturn.setOnClickListener {                                                //(IIE,2024)
                buttonReturn.setOnClickListener {                                            //IIE,2024)
                    val intent = Intent(                                                            //(Github,2024),(OpenA.i,2024)
                        this,                                                          //(Github,2024),(OpenA.i,2024)
                        MainScreen::class.java
                    )                                                                               //(OpenA.i,2024)
                    startActivity(intent)
                }
            }
        }
    }
}
