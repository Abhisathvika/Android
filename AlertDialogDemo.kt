package com.example.flowerbouquetapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertDialogDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_dialog_demo)
        val btn= findViewById<Button>(R.id.button3)
        btn.setOnClickListener{
            var d = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null) //inflating the layout
            var g = AlertDialog.Builder(this).setView(d)
            g.setPositiveButton("Subscribe") { dialog, _ ->
                val e = d.findViewById<EditText>(R.id.editTextText)
                val email = e.text.toString()

                if (email.isNotBlank()) {
                    Toast.makeText(this, "subscribed with $email", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "enter valid email", Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            g.setNegativeButton("cancel") { dialog, _ -> dialog.dismiss() }

            g.create().show()

        }
    }
}
