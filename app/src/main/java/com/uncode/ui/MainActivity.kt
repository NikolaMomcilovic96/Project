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

        val data = mutableListOf(
            Data(
                "Tendency to Overweight",
                "High",
                47,
                "low",
                "normal",
                "high",
                "There is a high tendency to become overweight."
            ),
            Data(
                "Feeling Hungry",
                "Normal",
                83,
                "low",
                "normal",
                "high",
                "You have a normal feeling of hunger compared to people with other genetic constellations."
            ),
            Data(
                "Inclination to Jojo Effect",
                "High",
                50,
                "low",
                "medium",
                "high",
                "With your genotype you tend towards the yo-yo effect."
            )
        )


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ResultItemAdapter(data)
    }
}