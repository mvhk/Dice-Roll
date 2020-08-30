package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*
This activity allows you to roll a dice by the user
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbutton)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val textviewNumber: TextView = findViewById(R.id.randomnumberText)
        textviewNumber.text = diceRoll.toString()
    }
}


class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}