package com.example.appventaagua

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.Toast

class Shopping : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping)

        val productList = listOf(
            Product("Agua mineral natural", "Botella de agua mineral natural, 500ml", 1.50, R.drawable.logo),
            Product("Agua con gas", "Botella de agua con gas, 1 litro", 2.00, R.drawable.logo),
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductAdapter(productList)

        val buttonGoToCart: Button = findViewById(R.id.button2)
        buttonGoToCart.setOnClickListener {
            val intent = Intent(this, Shopping::class.java)
            startActivity(intent)
        }
    }

    fun buttonAddToCart(view: View) {
        Toast.makeText(this, "Producto agregado al carrito", Toast.LENGTH_SHORT).show()
    }

}