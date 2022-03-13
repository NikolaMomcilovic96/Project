package com.uncode.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.uncode.R
import com.uncode.ui.DataModel

class MetabolicViewItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.protein_type_card, this, true)
    }

    fun setData(data: DataModel.Metabolic) {
        val protein = findViewById<TextView>(R.id.proteinTextView)
        val proteinValue = findViewById<TextView>(R.id.proteinValueTextView)
        val carbohydrate = findViewById<TextView>(R.id.carbohydrateTextView)
        val carbohydrateValue = findViewById<TextView>(R.id.carbohydrateValue)
        val fat = findViewById<TextView>(R.id.fatTextView)
        val fatValue = findViewById<TextView>(R.id.fatValue)
        protein.text = data.protein
        proteinValue.text = "${data.proteinValue}%"
        carbohydrate.text = data.carbohydrate
        carbohydrateValue.text = "${data.carbohydrate}%"
        fat.text = data.fat
        fatValue.text = "${data.fatValue}%"
    }
}