package com.uncode.ui

sealed class DataModel {
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

    data class Vitamin(
        val vitaminA: String,
        val vitaminB1: String,
        val vitaminB2: String,
        val vitaminB3: String,
        val vitaminB5: String,
        val vitaminB6: String,
        val vitaminB7: String,
        val vitaminB9: String,
        val vitaminC: String,
        val vitaminD: String,
        val vitaminE: String,
        val vitaminK: String
    ) : DataModel()

    data class Minerals(
        val calcium: String,
        val iron: String,
        val magnesium: String,
        val selenium: String,
        val zinc: String
    ) : DataModel()

    data class Antioxidants(
        val coq10: String,
        val lackOfGluthione: String
    ) : DataModel()

    data class UnsaturatedFattyAcids(
        val monounsaturated: String,
        val polyunsaturated: String
    ) : DataModel()

    data class Sensitivities(
        val caffeine: String,
        val gluten: String,
        val salt: String
    ) : DataModel()
}