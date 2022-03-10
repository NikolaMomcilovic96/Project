package com.uncode.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class UncodeSeekBar(context: Context, attrs: AttributeSet? = null) :
    View(context, attrs) {


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        makeCustomSeekBar(canvas)
    }

    private fun makeCustomSeekBar(canvas: Canvas) {
        val viewWidth = width.toFloat()
        val firstSection = (viewWidth / 3)
        val secondSection = (firstSection + firstSection)

        var start = 0f
        var end = 2f

        while (start < viewWidth) {
            when {
                start < firstSection -> {
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
                }
                start > firstSection && start < secondSection -> {
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
                }
                start > firstSection && start > secondSection -> {
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
                }
            }
            start += 15.0f
            end += 15.0f
        }
    }
}