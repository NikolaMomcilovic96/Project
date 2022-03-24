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
import kotlinx.android.synthetic.main.antioxidants_card.view.*
import kotlinx.android.synthetic.main.vitamin_field.view.*

class AntioxidantsViewItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) :
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.antioxidants_card, this, true)
    }

    fun setData(data: DataModel.Antioxidants) {
        val coq10 = "COQ10"
        val lackOfGluthione = "Lack of Gluthione"
        val antioxidantsCard = findViewById<CardView>(R.id.antioxidantsCard)

        antioxidantsCard.includeCoq10.vitaminName.text = coq10
        antioxidantsCard.includeLackOfGluthione.vitaminName.text = lackOfGluthione

        antioxidantsCard.includeCoq10.vitaminValue.text=data.coq10
        antioxidantsCard.includeLackOfGluthione.vitaminValue.text=data.lackOfGluthione

        setColor(antioxidantsCard.includeCoq10.vitaminValue, data.coq10)
        setColor(antioxidantsCard.includeLackOfGluthione.vitaminValue, data.lackOfGluthione)
    }

    private fun setColor(antioxidantsCard: TextView, vitamin: String) {
        when (vitamin) {
            "Normal" -> {
                antioxidantsCard.setTextColor(Color.GREEN)
            }
            "Slightly Increased" -> {
                antioxidantsCard.setTextColor(Color.YELLOW)
            }
            "Elevated" -> {
                antioxidantsCard.setTextColor(Color.RED)
            }
        }
    }
}