package com.example.flowerbouquetapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)
        val sid= findViewById<Button>(R.id.button1)
        sid.setOnClickListener{view->
            Snackbar.make(view, "this is a snackbar", Snackbar.LENGTH_LONG).setAction("undo"){
                Toast.makeText(this, "undo was clicked", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}
