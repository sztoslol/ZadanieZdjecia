package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian1)
        var zdj = 1
        findViewById<Button>(R.id.DalejBtn).setOnClickListener {
            if(zdj == 1)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian1)
            }
            if(zdj == 2)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian2)
            }
            if(zdj == 3)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian3)
            }
            if(zdj == 4)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian4)
                zdj = 0;
            }
            zdj++
        }
        findViewById<Button>(R.id.WrocBtn).setOnClickListener {
            if(zdj == 1)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian1)
                zdj = 5
            }
            if(zdj == 2)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian2)
            }
            if(zdj == 3)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian3)
            }
            if(zdj == 4)
            {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.adrian4)
            }
            zdj--
        }
        findViewById<Button>(R.id.PozLewaBtn).setOnClickListener {
            var rotacja = "-" + findViewById<TextView>(R.id.Rotacjatext).text
            findViewById<ImageView>(R.id.obraz).rotationY = rotacja.toString().toFloat() + findViewById<ImageView>(R.id.obraz).rotationY
        }
        findViewById<Button>(R.id.PozPrawaBtn).setOnClickListener {
            var rotacja = findViewById<TextView>(R.id.Rotacjatext).text
            findViewById<ImageView>(R.id.obraz).rotationY = rotacja.toString().toFloat() + findViewById<ImageView>(R.id.obraz).rotationY
        }
        findViewById<Button>(R.id.SkalaBtn).setOnClickListener {
            var skala = findViewById<TextView>(R.id.SkalaText).text
            findViewById<ImageView>(R.id.SkalaText).scaleX = skala.toString().toFloat()
            findViewById<ImageView>(R.id.SkalaText).scaleY = skala.toString().toFloat()
        }
        findViewById<Button>(R.id.AlfaBtn).setOnClickListener {
            var alfa = findViewById<TextView>(R.id.AlfaText).text
            findViewById<ImageView>(R.id.obraz).alpha = alfa.toString().toFloat()
        }
    }
}