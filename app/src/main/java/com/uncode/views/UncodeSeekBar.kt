package com.uncode.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class UncodeSeekBar(context: Context, attrs: AttributeSet? = null) :
    View(context, attrs) {

    private val paintGreen = Paint(Paint.ANTI_ALIAS_FLAG)
        .apply {
            color = Color.GREEN
            style = Paint.Style.FILL
        }

    private val paintYellow = Paint(Paint.ANTI_ALIAS_FLAG)
        .apply {
            color = Color.YELLOW
            style = Paint.Style.FILL
        }

    private val paintRed = Paint(Paint.ANTI_ALIAS_FLAG)
        .apply {
            color = Color.RED
            style = Paint.Style.FILL
        }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val viewWidth = width.toFloat()
        val section = (viewWidth / 50)

        var start = 0f
        var end = section / 3
        for (i in 0 until 50) {
            when (i) {
                in 0..15 -> {
                    drawRect(canvas, start, end, paintGreen)
                }
                in 16..33 -> {
                    drawRect(canvas, start, end, paintYellow)
                }
                in 34..50 -> {
                    drawRect(canvas, start, end, paintRed)
                }
            }

            start += section
            end += section
        }
    }


    private fun drawRect(canvas: Canvas, start: Float, end: Float, color: Paint) {
        canvas.drawRoundRect(
            start,
            10f,
            end,
            (height.toFloat() - 10f),
            1f,
            1f,
            color
        )
    }
}