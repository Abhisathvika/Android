package com.example.sep11

import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sep21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sep21)
        val destinationSpinner: Spinner= findViewById(R.id.spinner)
        val packageListView: ListView= findViewById(R.id.list1)
        val destinations= arrayOf("Paris", "Tokyo", "New York")
        val packagesforParis= arrayOf("EiffelTower", "Louvre Museum", "River Seine")
        val packagesforNewYork= arrayOf("Statue of liberty", "Central Park", "Times square")
        val packagesforTokyo= arrayOf("Tokyo tower", "Mount Fuji", "Senso-ji Temple")

        val spinnerAdapter= ArrayAdapter(this, android.R.layout.simple_spinner_item, destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        destinationSpinner.adapter= spinnerAdapter

        val initialAdapter= ArrayAdapter(this, android.R.layout.simple_list_item_1, packagesforParis)
        packageListView.adapter= initialAdapter

        destinationSpinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedPackages= when(position){
                    0-> packagesforParis
                    1->packagesforNewYork
                    else->packagesforTokyo
                }
                val listAdapter=ArrayAdapter(this@Sep21, android.R.layout.simple_list_item_1, selectedPackages)
                packageListView.adapter=listAdapter


            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }


    }
}
