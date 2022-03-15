package com.uncode.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.uncode.R
import com.uncode.ui.DataModel
import kotlinx.android.synthetic.main.vitamin_field.view.*
import kotlinx.android.synthetic.main.vitamins_card.view.*

class VitaminViewItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    ConstraintLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.vitamins_card, this, true)
    }

    fun setData(data: DataModel.Vitamin) {

    }
}