package com.uncode.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ProgressBar

class MetabolicProgressBar(context: Context, attrs: AttributeSet? = null) :
    ProgressBar(context, attrs) {

    private var proteinValue = 0

    fun getData(value: Int) {
        proteinValue = value
    }

    override fun onDraw(canvas: Canvas) {
        when {
            proteinValue < 0 -> {
                drawRect(canvas, 0f, width.toFloat(), Color.GRAY)
            }
            proteinValue > 100 -> {
                drawRect(canvas, 0f, width.toFloat(), Color.GREEN)
            }
            else -> {
                val section = width.toFloat() / 100
                val loaded = section * proteinValue

                drawRect(canvas, 0f, loaded, Color.GREEN)
                drawRect(canvas, loaded, width.toFloat(), Color.GRAY)
            }
        }
    }

    private fun drawRect(canvas: Canvas, start: Float, end: Float, paint: Int) {
        canvas.drawRoundRect(
            start,
            0f.toDp(),
            end,
            height.toFloat().toDp(),
            0f,
            0f,
            Paint(Paint.ANTI_ALIAS_FLAG).apply {
                color = paint
                style = Paint.Style.FILL
            }
        )
    }

    private fun Float.toDp() = this * resources.displayMetrics.density
}
