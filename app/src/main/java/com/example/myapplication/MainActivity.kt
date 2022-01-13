package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.widget.ImageViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian1)
        var zdj = 1
        findViewById<Button>(R.id.dalej).setOnClickListener {
            zdj++;
            if(zdj == 1)
            {
                findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian1)
            }
            if(zdj == 2)
            {
                findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian2)
            }
            if(zdj == 3)
            {
                findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian3)
            }
            if(zdj == 4)
            {
                findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian4)
            }
        }
    }
}