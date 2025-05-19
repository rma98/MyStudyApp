package com.robson.mystudyapp.data

import com.robson.mystudyapp.model.Product

object FakeProductData {
    val productList = listOf(
        Product(1, "Smartphone", "A powerful phone with great camera", 1999.99),
        Product(2, "Notebook", "Lightweight laptop with SSD", 3999.99),
        Product(3, "Fone Bluetooth", "Wireless earbuds with noise cancellation", 199.99),
        Product(4, "Carregador Turbo", "Fast charger with USB-C", 89.90),
        Product(5, "Teclado Mecânico", "RGB mechanical keyboard", 349.99)
    )
}
