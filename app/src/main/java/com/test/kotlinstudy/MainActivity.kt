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


        val image1 = findViewById<ImageView>(R.id.img_1)
        image1.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity1::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.img_2)
        image2.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity2::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.img_3)
        image3.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity3::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.img_4)
        image4.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity4::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.img_5)
        image5.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity5::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.img_6)
        image6.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity6::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.img_1)
        image7.setOnClickListener{

            Toast.makeText(this, "클릭완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, ImgActivity7::class.java)
            startActivity(intent)
        }
    }

}