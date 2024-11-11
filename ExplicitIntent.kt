package com.example.sep11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.net.Uri

class ExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit_intent)
       val implicit_button= findViewById<Button>(R.id.button2)
        implicit_button.setOnClickListener{
            val intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val b= findViewById<Button>(R.id.button3)
        b.setOnClickListener{
            val int= Intent(Intent.ACTION_VIEW)
            int.data= Uri.parse("https://chatgpt.com/")
            startActivity(int)
        }
    }
}
