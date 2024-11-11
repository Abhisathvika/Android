package com.example.sep11

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log2)
        var btnlogentry= findViewById<Button>(R.id.button4)
        btnlogentry.setOnClickListener{
            Log.v(TAG, "Verbose log: lowest priority, detailed entry, no use during production")
            Log.d(TAG,"Debug Log: highest priority, this is used to debug the app")
            Log.i(TAG, "Info log: moderate level importance, they give information")
            Log.w(TAG, "Warning log: This is a warning message for unexpected")
        }
    }
}
