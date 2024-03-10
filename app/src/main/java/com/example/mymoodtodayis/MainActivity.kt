package com.example.mymoodtodayis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.widget.addTextChangedListener


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NombreUser = findViewById<EditText>(R.id.NombreUser)


        val buttonImage = findViewById<ImageButton>(R.id.felizbutton)

        buttonImage.setOnClickListener{
            val message: String = NombreUser.text.toString()
            val intent = Intent(this,MainAlegre::class.java)
            intent.putExtra("EXTRA_message", message)

            startActivity(intent)

        }

        val buttonImage2 = findViewById<ImageButton>(R.id.enojadobutton)

        buttonImage2.setOnClickListener{
            val message: String = NombreUser.text.toString()
            val intent = Intent(this,MainEnojado::class.java)
            intent.putExtra("EXTRA_message", message)
            startActivity(intent)
        }

        val buttonImage3 = findViewById<ImageButton>(R.id.tristebutton)

        buttonImage3.setOnClickListener{
            val message: String = NombreUser.text.toString()
            val intent = Intent(this,MainTriste::class.java)
            intent.putExtra("EXTRA_message", message)
            startActivity(intent)
        }
    }
}