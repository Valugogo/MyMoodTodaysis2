package com.example.mymoodtodayis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainEnojado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_enojado)

        val TextoEnojado = findViewById<TextView>(R.id.TextEnojado)
        val recibemessage:String = intent.extras?.getString("EXTRA_message").orEmpty()
        TextoEnojado.text = recibemessage


        val volverbutton = findViewById<Button>(R.id.Volverbutton)

        volverbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}