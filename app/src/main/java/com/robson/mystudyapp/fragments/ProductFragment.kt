package com.robson.mystudyapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robson.mystudyapp.R
import com.robson.mystudyapp.data.FakeProductData // Importa os dados falsos
import com.robson.mystudyapp.fragments.MyProductRecyclerViewAdapter // Certifique-se de importar corretamente

class ProductFragment : Fragment() {

    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_list, container, false)

        // Verifica se a view é um RecyclerView e configura o layout e o adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = if (columnCount <= 1) {
                    LinearLayoutManager(context)
                } else {
                    GridLayoutManager(context, columnCount)
                }

                adapter = MyProductRecyclerViewAdapter(FakeProductData.productList)
            }
        }
        return view
    }

    companion object {
        const val ARG_COLUMN_COUNT = "column-count"

        @JvmStatic
        fun newInstance(columnCount: Int) =
            ProductFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}
