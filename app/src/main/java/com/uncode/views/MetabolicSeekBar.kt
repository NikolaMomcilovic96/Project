package com.uncode.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class MetabolicSeekBar(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val color = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.CYAN
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val section = width / 100

        val title = "Protein"
        val percent = 48
        var start = 0f
        var end = section.toFloat()

        for (i in 0..percent) {
            drawRect(canvas, start, end, color)
            start += section
            end += section
        }
    }

    private fun drawRect(canvas: Canvas, start: Float, end: Float, color: Paint) {
        canvas.drawRoundRect(
            start,
            0f,
            end,
            height.toFloat(),
            0f,
            0f,
            color
        )
    }
}