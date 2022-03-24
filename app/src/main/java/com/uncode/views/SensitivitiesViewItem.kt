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
import kotlinx.android.synthetic.main.sensitivities_card.view.*
import kotlinx.android.synthetic.main.vitamin_field.view.*

class SensitivitiesViewItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) :
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.sensitivities_card, this, true)
    }

    fun setData(data: DataModel.Sensitivities) {
        val caffeine = "Caffeine"
        val gluten = "Gluten"
        val salt = "Salt"
        val sensitivitiesCard = findViewById<CardView>(R.id.sensitivitiesCard)

        sensitivitiesCard.includeCaffeine.vitaminName.text = caffeine
        sensitivitiesCard.includeGluten.vitaminName.text = gluten
        sensitivitiesCard.includeSalt.vitaminName.text = salt

        sensitivitiesCard.includeCaffeine.vitaminValue.text = data.caffeine
        sensitivitiesCard.includeGluten.vitaminValue.text = data.gluten
        sensitivitiesCard.includeSalt.vitaminValue.text = data.salt

        setColor(sensitivitiesCard.includeCaffeine.vitaminValue, data.caffeine)
        setColor(sensitivitiesCard.includeGluten.vitaminValue, data.gluten)
        setColor(sensitivitiesCard.includeSalt.vitaminValue, data.salt)
    }

    private fun setColor(sensitivitiesCard: TextView, vitamin: String) {
        when (vitamin) {
            "Normal" -> {
                sensitivitiesCard.setTextColor(Color.GREEN)
            }
            "Slightly Increased" -> {
                sensitivitiesCard.setTextColor(Color.YELLOW)
            }
            "Elevated" -> {
                sensitivitiesCard.setTextColor(Color.RED)
            }
        }
    }
}