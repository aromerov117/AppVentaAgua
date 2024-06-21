package com.example.appventaagua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)

    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)

    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageViewProduct: ImageView = itemView.findViewById(R.id.imageViewProduct)
        private val textViewProductName: TextView = itemView.findViewById(R.id.textViewProductName)
        private val textViewProductDescription: TextView = itemView.findViewById(R.id.textViewProductDescription)
        private val textViewProductPrice: TextView = itemView.findViewById(R.id.textViewProductPrice)

        fun bind(product: Product) {
            imageViewProduct.setImageResource(product.imageResId)
            textViewProductName.text = product.name
            textViewProductDescription.text = product.description
            textViewProductPrice.text = "$ ${product.price}"


        }

    }

}
