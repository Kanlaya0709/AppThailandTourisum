package com.example.thailandtourisum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity","onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","onStart called")

    }
}
