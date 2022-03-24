package com.uncode.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.uncode.R
import com.uncode.ui.DataModel

class ResultViewItem @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.result_item, this, true)
    }

    fun setData(data: DataModel.Data) {
        val title = findViewById<TextView>(R.id.titleTextView)
        val value = findViewById<TextView>(R.id.valueTextView)
        val low = findViewById<TextView>(R.id.lowTextView)
        val mid = findViewById<TextView>(R.id.midTextView)
        val high = findViewById<TextView>(R.id.highTextView)
        val text = findViewById<TextView>(R.id.textTextView)
        //val uncodeSeekBar = findViewById<UncodeSeekBar>(R.id.uncodeSeekBar)
        title.text = data.title
        value.text = data.value
        low.text = data.low
        mid.text = data.mid
        high.text = data.high
        text.text = data.text
    }
}