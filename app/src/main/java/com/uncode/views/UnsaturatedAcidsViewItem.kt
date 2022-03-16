package com.uncode.views

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.uncode.R
import com.uncode.ui.DataModel
import kotlinx.android.synthetic.main.unsaturated_acids_card.view.*
import kotlinx.android.synthetic.main.vitamin_field.view.*

class UnsaturatedAcidsViewItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) :
    ConstraintLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.unsaturated_acids_card, this, true)
    }

    fun setData(data: DataModel.UnsaturatedFattyAcids) {
        val mono = "Monounsaturated"
        val poly = "Polyunsaturated"
        val acidsCard = findViewById<CardView>(R.id.unsaturatedAcidsCard)

        acidsCard.includeMono.vitaminName.text = mono
        acidsCard.includePoly.vitaminName.text = poly

        acidsCard.includeMono.vitaminValue.text = data.monounsaturated
        acidsCard.includePoly.vitaminValue.text = data.polyunsaturated

        setColor(acidsCard.includeMono.vitaminValue, data.monounsaturated)
        setColor(acidsCard.includePoly.vitaminValue, data.polyunsaturated)
    }

    private fun setColor(acidsCard: TextView, vitamin: String) {
        when (vitamin) {
            "Normal" -> {
                acidsCard.setTextColor(Color.GREEN)
            }
            "Slightly Increased" -> {
                acidsCard.setTextColor(Color.YELLOW)
            }
            "Elevated" -> {
                acidsCard.setTextColor(Color.RED)
            }
        }
    }
}