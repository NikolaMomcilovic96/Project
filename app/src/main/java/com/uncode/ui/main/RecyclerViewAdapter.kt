package com.uncode.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uncode.R
import com.uncode.ui.DataModel
import kotlinx.android.synthetic.main.protein_type_card.view.*
import kotlinx.android.synthetic.main.rv_item_list.view.*

class ResultItemAdapter(
    private val adapterData: List<DataModel> = listOf()
) : RecyclerView.Adapter<ResultItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dataModel: DataModel) {
            when (dataModel) {
                is DataModel.Metabolic -> {
                    bindMetabolic(dataModel)
                }
                is DataModel.Data -> {
                    bindData(dataModel)
                }
            }
        }

        private fun bindMetabolic(item: DataModel.Metabolic) {

            /*itemView.findViewById<TextView>(R.id.proteinTextView)?.text = item.protein
            itemView.findViewById<TextView>(R.id.proteinValueTextView)?.text =
                item.proteinValue.toString()
            itemView.findViewById<TextView>(R.id.carbohydrateTextView)?.text = item.carbohydrate
            itemView.findViewById<TextView>(R.id.carbohydrateValue)?.text =
                item.carbohydrateValue.toString()
            itemView.findViewById<TextView>(R.id.fatTextView)?.text = item.fat
            itemView.findViewById<TextView>(R.id.fatValue)?.text = item.fatValue.toString()*/
        }

        private fun bindData(item: DataModel.Data) {
            itemView.resultItemView.setData(item)}
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ResultItemAdapter.ViewHolder {
        val layout = when (viewType) {
            TYPE_METABOLIC -> R.layout.rv_metabolic_item_list
            TYPE_DATA -> R.layout.rv_item_list
            else -> {
                0
            }
        }

        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(adapterData[position])
    }

    override fun getItemViewType(position: Int): Int {
        return when (adapterData[position]) {
            is DataModel.Data -> TYPE_DATA
            is DataModel.Metabolic -> TYPE_METABOLIC
        }
    }

    override fun getItemCount(): Int {
        return adapterData.size
    }

    companion object {
        const val TYPE_METABOLIC = 0
        const val TYPE_DATA = 1
    }
}