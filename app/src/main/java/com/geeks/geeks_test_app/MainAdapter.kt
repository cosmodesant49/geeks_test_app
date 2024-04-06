package com.geeks.geeks_test_app

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.geeks.geeks_test_app.databinding.ItemCarBinding


class MainAdapter : RecyclerView.Adapter<MainAdapter.CarViewHolder>() {

    var data: List<Car> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class CarViewHolder(val binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}