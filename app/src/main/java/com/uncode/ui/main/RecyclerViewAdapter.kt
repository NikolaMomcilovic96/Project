package com.uncode.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uncode.databinding.RvItemListBinding
import com.uncode.ui.Data
import kotlinx.android.synthetic.main.rv_item_list.view.*

class ResultItemAdapter(
    private val data: List<Data>
) : RecyclerView.Adapter<ResultItemAdapter.ViewHolder>() {

    inner class ViewHolder(binding: RvItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultItemAdapter.ViewHolder {
        val binding = RvItemListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.resultItemView.setData(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}