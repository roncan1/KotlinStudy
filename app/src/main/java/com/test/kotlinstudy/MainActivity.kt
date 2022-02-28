package com.test.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list_item = mutableListOf<String>()

        list_item.add("A")
        list_item.add("B")
        list_item.add("C")

        val listView = findViewById<ListView>(R.id.listView)

        val adapter = ListViewAdapter(list_item)
        listView.adapter = adapter
    }

}