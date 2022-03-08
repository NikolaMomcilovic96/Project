package com.uncode.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uncode.databinding.CardItemBinding
import kotlinx.android.synthetic.main.card_item.view.*

class RecyclerViewAdapter(private val data: MutableList<Data>) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.cardTitle.text = data[position].title
        holder.itemView.intensityValue.text = data[position].value
        holder.itemView.seekBar.progress = data[position].progress
        holder.itemView.lowValue.text = data[position].low
        holder.itemView.midValue.text = data[position].medium
        holder.itemView.highValue.text = data[position].high
        holder.itemView.cardText.text = data[position].text

        holder.itemView.seekBar.isEnabled=false
    }

    override fun getItemCount(): Int {
        return data.size
    }
}