package com.example.createabutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var decrementButton: Button
    private lateinit var incrementButton: Button
    private lateinit var tV: TextView
    private var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Find the button and text in the layout
        decrementButton = findViewById<Button>(R.id.decrementButton)
        tV = findViewById<TextView>(R.id.textView)
        incrementButton = findViewById<Button>(R.id.incrementButton)

        //Set a clicker listener on the button to decrease number when the user taps the button
        decrementButton.setOnClickListener {
            i--
            if (i <= 0) {
                i = 0
                tV.text =("0")
            }
            else {
                tV.text =("$i")
            }

        }
        //Set a clicker listener on the button to increase number when the user taps the button
        incrementButton.setOnClickListener {

            i++

            tV.text = (" $i")
        }
    }
}

