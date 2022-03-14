package com.uncode.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MetabolicType(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val color = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GREEN
        style = Paint.Style.FILL
    }

    private val background = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GRAY
        style = Paint.Style.FILL
    }

    private var proteinValue = 0

    fun getData(value: Int) {
        proteinValue = value
    }

    override fun onDraw(canvas: Canvas) {
        when {
            proteinValue < 0 -> {
                drawRect(canvas, 0f, width.toFloat(), background)
            }
            proteinValue > 100 -> {
                drawRect(canvas, 0f, width.toFloat(), color)
            }
            else -> {
                val section = width.toFloat() / 100
                val loaded = section * proteinValue

                drawRect(canvas, 0f, loaded, color)
                drawRect(canvas, loaded, width.toFloat(), background)
            }
        }
    }

    private fun drawRect(canvas: Canvas, start: Float, end: Float, color: Paint) {
        canvas.drawRoundRect(
            start,
            0f.toDp(),
            end,
            height.toFloat().toDp(),
            0f,
            0f,
            color
        )
    }

    private fun Float.toDp() = this * resources.displayMetrics.density
}
