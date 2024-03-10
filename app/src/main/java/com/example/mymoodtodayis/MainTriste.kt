package com.example.mymoodtodayis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainTriste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_triste)

        val TextoTriste = findViewById<TextView>(R.id.TextoTrizteNom)
        val recibemessage:String = intent.extras?.getString("EXTRA_message").orEmpty()
        TextoTriste.text = recibemessage


        val Homebutton = findViewById<Button>(R.id.buttonregreesar)

        Homebutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}