package com.uncode.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View

class MetabolicSeekBar(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

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
        val section = (width.toFloat() / 101)
        Log.d("Width",width.toFloat().toString())
        Log.d("Section", section.toString())
        var start = 0f
        var end = section

        for (i in 0..proteinValue) {
            Log.d("Start, end", "$start, $end")
            drawRect(canvas, start, end, color)
            start += section
            end += section
        }

        for (i in proteinValue..width) {
            drawRect(canvas, start, end, background)
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