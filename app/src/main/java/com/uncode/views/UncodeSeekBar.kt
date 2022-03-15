package com.uncode.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class UncodeSeekBar(context: Context, attrs: AttributeSet? = null) :
    View(context, attrs) {

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val viewWidth = width.toFloat()
        val section = (viewWidth / 50)

        var start = 0f
        var end = section / 3
        for (i in 0 until 50) {
            when (i) {
                in 0..15 -> {
                    drawRect(canvas, start, end, Color.GREEN)
                }
                in 16..33 -> {
                    drawRect(canvas, start, end, Color.YELLOW)
                }
                in 34..50 -> {
                    drawRect(canvas, start, end, Color.RED)
                }
            }
            start += section
            end += section
        }
    }

    private fun drawRect(canvas: Canvas, start: Float, end: Float, paint: Int) {
        canvas.drawRoundRect(
            start,
            10f.toDp(),
            end,
            (height.toFloat() - 10f).toDp(),
            1f,
            1f,
            Paint(Paint.ANTI_ALIAS_FLAG).apply {
                color = paint
                style = Paint.Style.FILL
            }
        )
    }

    private fun Float.toDp() = this * resources.displayMetrics.density
}