package com.uncode.views

import android.content.Context
import android.graphics.Color.*
import android.text.Layout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.uncode.R
import com.uncode.databinding.VitaminsCardBinding
import com.uncode.ui.DataModel
import kotlinx.android.synthetic.main.vitamin_field.view.*
import kotlinx.android.synthetic.main.vitamins_card.view.*

class VitaminViewItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    ConstraintLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.vitamins_card, this, true)
    }

    fun setData(data: DataModel.Vitamin) {
        val vitaminCard = findViewById<CardView>(R.id.vitaminsCard)
        val vitaminA = "Vitamin A"
        val vitaminB1 = "Vitamin B1"
        val vitaminB2 = "Vitamin B2"
        val vitaminB3 = "Vitamin B3"
        val vitaminB5 = "Vitamin B5"
        val vitaminB6 = "Vitamin B6"
        val vitaminB7 = "Vitamin B7"
        val vitaminB9 = "Vitamin B9"
        val vitaminC = "Vitamin C"
        val vitaminD = "Vitamin D"
        val vitaminE = "Vitamin E"
        val vitaminK = "Vitamin K"

        vitaminCard.includeA.vitaminName.text = vitaminA
        vitaminCard.includeB1.vitaminName.text = vitaminB1
        vitaminCard.includeB2.vitaminName.text = vitaminB2
        vitaminCard.includeB3.vitaminName.text = vitaminB3
        vitaminCard.includeB5.vitaminName.text = vitaminB5
        vitaminCard.includeB6.vitaminName.text = vitaminB6
        vitaminCard.includeB7.vitaminName.text = vitaminB7
        vitaminCard.includeB9.vitaminName.text = vitaminB9
        vitaminCard.includeC.vitaminName.text = vitaminC
        vitaminCard.includeD.vitaminName.text = vitaminD
        vitaminCard.includeE.vitaminName.text = vitaminE
        vitaminCard.includeK.vitaminName.text = vitaminK
        vitaminCard.includeA.vitaminValue.text = data.vitaminA
        vitaminCard.includeB1.vitaminValue.text = data.vitaminB1
        vitaminCard.includeB2.vitaminValue.text = data.vitaminB2
        vitaminCard.includeB3.vitaminValue.text = data.vitaminB3
        vitaminCard.includeB5.vitaminValue.text = data.vitaminB5
        vitaminCard.includeB6.vitaminValue.text = data.vitaminB6
        vitaminCard.includeB7.vitaminValue.text = data.vitaminB7
        vitaminCard.includeB9.vitaminValue.text = data.vitaminB9
        vitaminCard.includeC.vitaminValue.text = data.vitaminC
        vitaminCard.includeD.vitaminValue.text = data.vitaminD
        vitaminCard.includeE.vitaminValue.text = data.vitaminE
        vitaminCard.includeK.vitaminValue.text = data.vitaminK

        setColor(vitaminCard.includeA.vitaminValue, data.vitaminA)
        setColor(vitaminCard.includeB1.vitaminValue, data.vitaminB1)
        setColor(vitaminCard.includeB2.vitaminValue, data.vitaminB2)
        setColor(vitaminCard.includeB3.vitaminValue, data.vitaminB3)
        setColor(vitaminCard.includeB5.vitaminValue, data.vitaminB5)
        setColor(vitaminCard.includeB6.vitaminValue, data.vitaminB6)
        setColor(vitaminCard.includeB7.vitaminValue, data.vitaminB7)
        setColor(vitaminCard.includeB9.vitaminValue, data.vitaminB9)
        setColor(vitaminCard.includeC.vitaminValue, data.vitaminC)
        setColor(vitaminCard.includeD.vitaminValue, data.vitaminD)
        setColor(vitaminCard.includeE.vitaminValue, data.vitaminE)
        setColor(vitaminCard.includeK.vitaminValue, data.vitaminK)
    }

    private fun setColor(vitaminCard: TextView, vitamin: String){
        when (vitamin) {
            "Normal" -> {
                vitaminCard.setTextColor(GREEN)
            }
            "Slightly Increased" -> {
                vitaminCard.setTextColor(YELLOW)
            }
            else -> {
                vitaminCard.setTextColor(RED)
            }
        }
    }
}