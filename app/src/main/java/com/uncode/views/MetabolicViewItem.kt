package com.uncode.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.uncode.R
import com.uncode.ui.DataModel
import kotlinx.android.synthetic.main.protein_type_card.view.*

class MetabolicViewItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.protein_type_card, this, true)
    }

    fun setData(data: DataModel.Metabolic) {
        val proteinValue = "${data.proteinValue}%"
        val carbohydrateValue = "${data.carbohydrateValue}%"
        val fatValue = "${data.fatValue}%"
        findViewById<TextView>(R.id.proteinTextView).text = data.protein
        findViewById<TextView>(R.id.proteinValue).text = proteinValue
        findViewById<TextView>(R.id.carbohydrateTextView).text = data.carbohydrate
        findViewById<TextView>(R.id.carbohydrateValue).text = carbohydrateValue
        findViewById<TextView>(R.id.fatTextView).text = data.fat
        findViewById<TextView>(R.id.fatValue).text = fatValue
        proteinSeekBar.getData(data.proteinValue)
        carbohydrateSeekBar.getData(data.carbohydrateValue)
        fatSeekBar.getData(data.fatValue)
    }
}