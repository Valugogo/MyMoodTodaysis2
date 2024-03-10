package com.example.mymoodtodayis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainAlegre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_alegre)

        val NombreUser = findViewById<TextView>(R.id.NombreFeli)
        val recibemessage:String = intent.extras?.getString("EXTRA_message").orEmpty()
        NombreUser.text = recibemessage

        val Regresarbutton = findViewById<Button>(R.id.Regresarbutton)

        Regresarbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}