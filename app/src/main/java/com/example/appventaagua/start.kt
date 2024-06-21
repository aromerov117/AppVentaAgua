package com.example.appventaagua

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.content.Intent

class Start : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)
    }

    fun register(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun catalogue(view: View) {
        val intent = Intent(this, Catalogue::class.java)
        startActivity(intent)
    }
}