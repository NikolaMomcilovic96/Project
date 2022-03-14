package com.uncode.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.widget.SeekBar

class UncodeSeekBar(context: Context, attrs: AttributeSet? = null) :
    androidx.appcompat.widget.AppCompatSeekBar(context, attrs) {

    private fun getPaint(paint: String): Paint {
        return Paint(Paint.ANTI_ALIAS_FLAG).apply {
            when (paint) {
                "green" -> {
                    color = Color.GREEN
                }
                "yellow" -> {
                    color = Color.YELLOW
                }
                "red" -> {
                    color = Color.RED
                }
            }
            style = Paint.Style.FILL
        }
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
                    drawRect(canvas, start, end, getPaint("green"))
                }
                in 16..33 -> {
                    drawRect(canvas, start, end, getPaint("yellow"))
                }
                in 34..50 -> {
                    drawRect(canvas, start, end, getPaint("red"))
                }
            }

            start += section
            end += section
        }
    }


    private fun drawRect(canvas: Canvas, start: Float, end: Float, color: Paint) {
        canvas.drawRoundRect(
            start,
            10f.toDp(),
            end,
            (height.toFloat() - 10f).toDp(),
            1f,
            1f,
            color
        )
    }

    private fun Float.toDp() = this * resources.displayMetrics.density
}