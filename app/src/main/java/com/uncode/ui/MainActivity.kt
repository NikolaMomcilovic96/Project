package com.uncode.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.uncode.databinding.ActivityMainBinding
import com.uncode.ui.main.ResultItemAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = listOf(
            DataModel.Metabolic("Protein", 28, "Carbohydrate", 47, "Fat", 25),
            DataModel.Data(
                "Tendency to Overweight",
                "High",
                "low",
                "normal",
                "high",
                "There is a high tendency to become overweight."
            ),
            DataModel.Data(
                "Feeling Hungry",
                "Normal",
                "low",
                "normal",
                "high",
                "You have a normal feeling of hunger compared to people with other genetic constellations."
            ),
            DataModel.Data(
                "Inclination to Jojo Effect",
                "High",
                "low",
                "medium",
                "high",
                "With your genotype you tend towards the yo-yo effect."
            ),
            DataModel.Vitamin(
                "Normal",
                "Slightly Increased",
                "Normal",
                "Elevated",
                "Normal",
                "Slightly Increased",
                "Normal",
                "Normal",
                "Slightly Increased",
                "Normal",
                "Elevated",
                "Normal"
            )
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ResultItemAdapter(data)
    }
}