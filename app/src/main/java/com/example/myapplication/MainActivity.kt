package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.ImageViewCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian1)
        var zdj = 1
        var rotacja = 0
        findViewById<Button>(R.id.dalej).setOnClickListener {
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
                zdj = 0;
            }
            zdj++
        }
        findViewById<Button>(R.id.wroc).setOnClickListener {
            if(zdj == 1)
            {
                findViewById<ImageView>(R.id.zdjecia).setImageResource(R.drawable.adrian1)
                zdj = 5
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
            zdj--
        }
        findViewById<Button>(R.id.pozycjaLewo).setOnClickListener {
            rotacja = findViewById<TextView>(R.id.Rotacjatext).toString().toInt()
                findViewById<ImageView>(R.id.zdjecia).setRotationY(
                    findViewById<ImageView>(R.id.zdjecia).rotationY + rotacja
                )
        }
    }
}