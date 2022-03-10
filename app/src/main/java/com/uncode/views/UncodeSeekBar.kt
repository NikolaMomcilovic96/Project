package com.uncode.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.View

class UncodeSeekBar(context: Context, attrs: AttributeSet? = null) :
    View(context, attrs) {


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val viewWidth = width.toFloat().toDp()
        val firstSection = (viewWidth / 3)
        val secondSection = (firstSection + firstSection)
        drawGreenArea(canvas, firstSection)
        //drawYellowArea(canvas, firstSection, secondSection)
        //drawRedArea(canvas, secondSection, width.toFloat().toDp())
    }

    private fun Float.toDp() = this / resources.displayMetrics.density

    private fun drawGreenArea(canvas: Canvas, endpoint: Float) {
        Log.d("Sirina polja dp", width.toFloat().toDp().toString())
        //Log.d("Kraj prvog", endpoint.toString())
        var start = 0f
        var end = 2f

        while (start.toDp() < endpoint) {
            canvas.drawRoundRect(
                start,
                10f.toDp(),
                end,
                (height.toFloat() - 10f),
                2f.toDp(),
                2f.toDp(),
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.GREEN
                        style = Paint.Style.FILL
                    })
            start += 15.0f
            end += 15.0f
        }
        //Log.d("Start", start.toDp().toString())
    }

    private fun drawYellowArea(canvas: Canvas, startpoint: Float, endpoint: Float) {
        //Log.d("Start2", startpoint.toString())
        //Log.d("Kraj2", endpoint.toString())
        var start = startpoint
        var end = (startpoint + 1)
        Log.d("Start2", start.toString())
        Log.d("End2", end.toString())

        while (start < endpoint) {
            canvas.drawRoundRect(
                start,
                10f.toDp(),
                end,
                (height.toFloat() - 10f),
                2f.toDp(),
                2f.toDp(),
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

        while (left < endpoint) {
            canvas.drawRoundRect(
                start,
                10f.toDp(),
                end,
                (height.toFloat() - 10f),
                2f.toDp(),
                2f.toDp(),
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