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
        val firstSection = (viewWidth / 3)
        val secondSection = (firstSection + firstSection)
        drawGreenArea(canvas, firstSection)
        drawYellowArea(canvas, firstSection, secondSection)
        drawRedArea(canvas, secondSection, viewWidth)
    }

    //private fun Float.toDp() = this / resources.displayMetrics.density

    private fun drawGreenArea(canvas: Canvas, endpoint: Float) {
        var start = 0f
        var end = 2f

        while (start < endpoint) {
            canvas.drawRoundRect(
                start,
                10f,
                end,
                (height.toFloat() - 10f),
                2f,
                2f,
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.GREEN
                        style = Paint.Style.FILL
                    })
            start += 15.0f
            end += 15.0f
        }
    }

    private fun drawYellowArea(canvas: Canvas, startpoint: Float, endpoint: Float) {
        var start = startpoint
        var end = startpoint + 1

        while (start < endpoint) {
            canvas.drawRoundRect(
                start,
                10f,
                end,
                (height.toFloat() - 10f),
                2f,
                2f,
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.YELLOW
                        style = Paint.Style.FILL
                    })
            start += 15.0f
            end += 15.0f
        }
    }

    private fun drawRedArea(canvas: Canvas, startpoint: Float, endpoint: Float) {
        var start = startpoint
        var end = startpoint + 1

        while (start < endpoint) {
            canvas.drawRoundRect(
                start,
                10f,
                end,
                (height.toFloat() - 10f),
                2f,
                2f,
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.RED
                        style = Paint.Style.FILL
                    })
            start += 15.0f
            end += 15.0f
        }
    }
}