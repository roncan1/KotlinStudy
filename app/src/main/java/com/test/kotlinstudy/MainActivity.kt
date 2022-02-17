package com.test.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageView>(R.id.img_1)
        btn1.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            startActivity(intent)
        }

        val btn2 = findViewById<ImageView>(R.id.img_2)
        btn2.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }

        val btn3 = findViewById<ImageView>(R.id.img_3)
        btn3.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }

        val btn4 = findViewById<ImageView>(R.id.img_4)
        btn4.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }

        val btn5 = findViewById<ImageView>(R.id.img_5)
        btn5.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }

        val btn6 = findViewById<ImageView>(R.id.img_6)
        btn6.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }

        val btn7 = findViewById<ImageView>(R.id.img_7)
        btn7.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }
    }

}