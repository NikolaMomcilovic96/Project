package com.uncode.ui

open class DataModel {
    data class Data(
        val title: String,
        val value: String,
        val low: String,
        val mid: String,
        val high: String,
        val text: String
    ) : DataModel()

    data class Metabolic(
        val protein: String,
        val proteinValue: Int,
        val carbohydrate: String,
        val carbohydrateValue: Int,
        val fat: String,
        val fatValue: Int
    ) : DataModel()
}