package com.uncode.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uncode.R
import com.uncode.ui.DataModel
import kotlinx.android.synthetic.main.rv_antioxidants_item_list.view.*
import kotlinx.android.synthetic.main.rv_item_list.view.*
import kotlinx.android.synthetic.main.rv_metabolic_item_list.view.*
import kotlinx.android.synthetic.main.rv_minerals_item_list.view.*
import kotlinx.android.synthetic.main.rv_sensitivities_item_list.view.*
import kotlinx.android.synthetic.main.rv_unsaturated_acids_item_list.view.*
import kotlinx.android.synthetic.main.rv_vitamin_item_list.view.*

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
                is DataModel.Vitamin -> {
                    bindVitamin(dataModel)
                }
                is DataModel.Minerals -> {
                    bindMinerals(dataModel)
                }
                is DataModel.Antioxidants -> {
                    bindAntioxidants(dataModel)
                }
                is DataModel.UnsaturatedFattyAcids -> {
                    bindUnsaturatedFattyAcids(dataModel)
                }
                is DataModel.Sensitivities -> {
                    bindSensitivities(dataModel)
                }
            }
        }

        private fun bindMetabolic(item: DataModel.Metabolic) {
            itemView.metabolicViewItem.setData(item)
        }

        private fun bindData(item: DataModel.Data) {
            itemView.resultItemView.setData(item)
        }

        private fun bindVitamin(item: DataModel.Vitamin) {
            itemView.vitaminViewItem.setData(item)
        }

        private fun bindMinerals(item: DataModel.Minerals) {
            itemView.mineralsViewItem.setData(item)
        }

        private fun bindAntioxidants(item: DataModel.Antioxidants) {
            itemView.antioxidantsViewItem.setData(item)
        }

        private fun bindUnsaturatedFattyAcids(item: DataModel.UnsaturatedFattyAcids) {
            itemView.unsaturatedAcidsViewItem.setData(item)
        }

        private fun bindSensitivities(item: DataModel.Sensitivities) {
            itemView.sensitivitiesViewItem.setData(item)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layout = when (viewType) {
            TYPE_METABOLIC -> R.layout.rv_metabolic_item_list
            TYPE_DATA -> R.layout.rv_item_list
            TYPE_VITAMIN -> R.layout.rv_vitamin_item_list
            TYPE_MINERALS -> R.layout.rv_minerals_item_list
            TYPE_ANTIOXIDANTS -> R.layout.rv_antioxidants_item_list
            TYPE_UNSATURATED_FATTY_ACIDS -> R.layout.rv_unsaturated_acids_item_list
            TYPE_SENSITIVITIES -> R.layout.rv_sensitivities_item_list
            else -> {
                7
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
            is DataModel.Vitamin -> TYPE_VITAMIN
            is DataModel.Minerals -> TYPE_MINERALS
            is DataModel.Antioxidants -> TYPE_ANTIOXIDANTS
            is DataModel.UnsaturatedFattyAcids -> TYPE_UNSATURATED_FATTY_ACIDS
            is DataModel.Sensitivities -> TYPE_SENSITIVITIES
        }
    }

    override fun getItemCount(): Int {
        return adapterData.size
    }

    companion object {
        const val TYPE_METABOLIC = 0
        const val TYPE_DATA = 1
        const val TYPE_VITAMIN = 2
        const val TYPE_MINERALS = 3
        const val TYPE_ANTIOXIDANTS = 4
        const val TYPE_UNSATURATED_FATTY_ACIDS = 5
        const val TYPE_SENSITIVITIES = 6
    }
}