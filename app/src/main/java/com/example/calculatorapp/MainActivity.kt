package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculatorapp.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var lastNumeric = false
    var stateError = false
    var lastDot = false

    private lateinit var exception: Exception

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClearClick(view: View) {}
    fun onBackClick(view: View) {}
    fun onOperatorClick(view: View) {}
    fun onDigitClick(view: View) {}
    fun onAllClearClick(view: View) {}
    fun onEqualClick(view: View) {}


}