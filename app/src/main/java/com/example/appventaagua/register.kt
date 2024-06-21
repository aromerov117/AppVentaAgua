package com.example.appventaagua

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import android.widget.Toast

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
    }

    fun registroExitoso() {
        val mensaje = "¡Registro exitoso!"
        val duracion = Toast.LENGTH_SHORT // Puedes ajustar la duración según tu preferencia
        val toast = Toast.makeText(applicationContext, mensaje, duracion)
        toast.show()
    }

    fun register(view: View) {
        val intent = Intent(this, Start::class.java)
        startActivity(intent)
        registroExitoso()
        finish()
    }
}