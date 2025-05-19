package com.robson.mystudyapp.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.robson.mystudyapp.databinding.FragmentProductBinding
import com.robson.mystudyapp.model.Product

class MyProductRecyclerViewAdapter(
    private val productList: List<Product>
) : RecyclerView.Adapter<MyProductRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentProductBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.idView.text = "ID: ${product.id}"
        holder.nameView.text = "Name: ${product.name}"
        holder.descriptionView.text = "Description: ${product.description}"
        holder.priceView.text = "Price: R$ ${String.format("%.2f", product.price)}"
    }

    override fun getItemCount(): Int = productList.size

    inner class ViewHolder(binding: FragmentProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemId
        val nameView: TextView = binding.itemName
        val descriptionView: TextView = binding.itemDescription
        val priceView: TextView = binding.itemPrice
    }
}
