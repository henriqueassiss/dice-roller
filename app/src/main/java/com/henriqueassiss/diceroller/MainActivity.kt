package com.henriqueassiss.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.activityMainButton)
        button.setOnClickListener{rollDice()}
    }

    private fun rollDice() {
        val imageResource = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val image: ImageView = findViewById(R.id.activityMainImage)
        image.setImageResource(imageResource)

        Toast.makeText(this, "Dado Atualizado", Toast.LENGTH_SHORT).show()
    }
}