package com.akirachix.fibonacci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val numbers = fibonacci(100)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        val numbersAdapter = NumbersRecyclerView(numbers)
        binding.rvNumbers.adapter = numbersAdapter
        }

    fun fibonacci(n: Int): List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size < n){
            numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex -1])

        }
        return numbers

    }
    }
