package com.test.kotlinstudy

import android.content.Intent
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

        val dice1 = findViewById<ImageView>(R.id.dice1)
        val dice2 = findViewById<ImageView>(R.id.dice2)

        val btn_start = findViewById<Button>(R.id.btnDiceStart)
        btn_start.setOnClickListener{

            Toast.makeText(this, "주사위 굴리기", Toast.LENGTH_LONG).show()

            val num1 = Random.nextInt(1, 6)
            val num2 = Random.nextInt(1, 6)

            if (num1 == 1) {
                dice1.setImageResource(R.drawable.dice_1)
            } else if (num1 == 2) {
                dice1.setImageResource(com.test.kotlinstudy.R.drawable.dice_2)
            } else if (num1 == 3) {
                dice1.setImageResource(com.test.kotlinstudy.R.drawable.dice_3)
            } else if (num1 == 4) {
                dice1.setImageResource(com.test.kotlinstudy.R.drawable.dice_4)
            } else if (num1 == 5) {
                dice1.setImageResource(com.test.kotlinstudy.R.drawable.dice_5)
            } else if (num1 == 6) {
                dice1.setImageResource(com.test.kotlinstudy.R.drawable.dice_6)
            }

            if (num2 == 1) {
                dice2.setImageResource(R.drawable.dice_1)
            } else if (num1 == 2) {
                dice2.setImageResource(com.test.kotlinstudy.R.drawable.dice_2)
            } else if (num1 == 3) {
                dice2.setImageResource(com.test.kotlinstudy.R.drawable.dice_3)
            } else if (num1 == 4) {
                dice2.setImageResource(com.test.kotlinstudy.R.drawable.dice_4)
            } else if (num1 == 5) {
                dice2.setImageResource(com.test.kotlinstudy.R.drawable.dice_5)
            } else if (num1 == 6) {
                dice2.setImageResource(com.test.kotlinstudy.R.drawable.dice_6)
            }
        }

    }

}