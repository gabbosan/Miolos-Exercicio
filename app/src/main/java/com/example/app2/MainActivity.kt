package com.example.app2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->


            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val switchLogo = findViewById<Switch>(R.id.switchCor)
        val imageMiolos = findViewById<ImageView>(R.id.imageViewlogo)
        val botaoLogo = findViewById<Button>(R.id.botaoMiolos)

        botaoLogo.setOnClickListener()
        {
            Toast.makeText(this, "PINK", Toast.LENGTH_SHORT).show()
            imageMiolos.setImageResource(R.drawable.miolos)
        }

        switchLogo.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // O switch está ativado
                Toast.makeText(this, "PRETA", Toast.LENGTH_SHORT).show()
                imageMiolos.setImageResource(R.drawable.miolospb)
            } else {
                // O switch está desativado
                Toast.makeText(this, "AZUL", Toast.LENGTH_SHORT).show()
                imageMiolos.setImageResource(R.drawable.miolosaz)

            }


        }
    }
}