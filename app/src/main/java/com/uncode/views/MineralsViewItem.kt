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
import kotlinx.android.synthetic.main.minerals_card.view.*
import kotlinx.android.synthetic.main.vitamin_field.view.*

class MineralsViewItem @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.minerals_card, this, true)
    }

    fun setData(data: DataModel.Minerals) {
        val calcium = "Calcium"
        val magnesium = "Magnesium"
        val selenium = "Selenium"
        val zinc = "Zinc"
        val iron = "Iron"
        val mineralsCard = findViewById<CardView>(R.id.mineralsCard)

        mineralsCard.includeCalcium.vitaminName.text = calcium
        mineralsCard.includeMagnesium.vitaminName.text = magnesium
        mineralsCard.includeSelenium.vitaminName.text = selenium
        mineralsCard.includeZinc.vitaminName.text = zinc
        mineralsCard.includeIron.vitaminName.text = iron

        mineralsCard.includeCalcium.vitaminValue.text = data.calcium
        mineralsCard.includeMagnesium.vitaminValue.text = data.magnesium
        mineralsCard.includeSelenium.vitaminValue.text = data.selenium
        mineralsCard.includeZinc.vitaminValue.text = data.zinc
        mineralsCard.includeIron.vitaminValue.text = data.iron

        setColor(mineralsCard.includeCalcium.vitaminValue, data.calcium)
        setColor(mineralsCard.includeMagnesium.vitaminValue, data.magnesium)
        setColor(mineralsCard.includeSelenium.vitaminValue, data.selenium)
        setColor(mineralsCard.includeZinc.vitaminValue, data.zinc)
        setColor(mineralsCard.includeIron.vitaminValue, data.iron)
    }

    private fun setColor(mineralCard: TextView, vitamin: String) {
        when (vitamin) {
            "Normal" -> {
                mineralCard.setTextColor(Color.GREEN)
            }
            "Slightly Increased" -> {
                mineralCard.setTextColor(Color.YELLOW)
            }
            "Elevated" -> {
                mineralCard.setTextColor(Color.RED)
            }
        }
    }
}