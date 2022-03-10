package com.uncode.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class UncodeSeekBar(context: Context, attrs: AttributeSet? = null) :
    View(context, attrs) {

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        drawGreenArea(canvas)
        drawYellowArea(canvas)
        drawRedArea(canvas)
    }

    private fun Float.toDp() = this * resources.displayMetrics.density

    private fun drawGreenArea(canvas: Canvas) {
        var left = 0.0f.toDp()
        var right = 0.7f.toDp()

        for (i in 0..18) {
            canvas.drawRoundRect(
                left.toDp(),
                10f.toDp(),
                right.toDp(),
                (height.toFloat() - 10f).toDp(),
                1f.toDp(),
                1f.toDp(),
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.GREEN
                        style = Paint.Style.FILL
                    })
            left += 2.0f.toDp()
            right += 2.0f.toDp()
        }
    }

    private fun drawYellowArea(canvas: Canvas) {
        var left = 38.0f.toDp()
        var right = 38.7f.toDp()

        for (i in 0..19) {
            canvas.drawRoundRect(
                left.toDp(),
                10f.toDp(),
                right.toDp(),
                (height.toFloat() - 10f).toDp(),
                3f.toDp(),
                3f.toDp(),
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.YELLOW
                        style = Paint.Style.FILL
                    })
            left += 2.0f.toDp()
            right += 2.0f.toDp()
        }
    }

    private fun drawRedArea(canvas: Canvas) {
        var left = 78.0f.toDp()
        var right = 78.7f.toDp()

        for (i in 0..18) {
            canvas.drawRoundRect(
                left.toDp(),
                10f.toDp(),
                right.toDp(),
                (height.toFloat() - 10f).toDp(),
                3f.toDp(),
                3f.toDp(),
                Paint(Paint.ANTI_ALIAS_FLAG)
                    .apply {
                        color = Color.RED
                        style = Paint.Style.FILL
                    })
            left += 2.0f.toDp()
            right += 2.0f.toDp()
        }
    }
}