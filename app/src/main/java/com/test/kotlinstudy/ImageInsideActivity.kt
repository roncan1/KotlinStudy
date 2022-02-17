package com.test.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        val image = findViewById<ImageView>(R.id.img)

        Toast.makeText(this, getData, Toast.LENGTH_SHORT).show()

        if (getData == "1"){
            image.setImageResource(R.drawable.img1)
        }

        if (getData == "2"){
            image.setImageResource(R.drawable.img2)
        }

        if (getData == "3"){
            image.setImageResource(R.drawable.img3)
        }

        if (getData == "4"){
            image.setImageResource(R.drawable.img4)
        }

        if (getData == "5"){
            image.setImageResource(R.drawable.img5)
        }

        if (getData == "6"){
            image.setImageResource(R.drawable.img6)
        }

        if (getData == "7"){
            image.setImageResource(R.drawable.img7)
        }
    }
}