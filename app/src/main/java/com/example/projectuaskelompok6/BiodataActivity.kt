package com.example.projectuaskelompok4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectuaskelompok6.databinding.ActivityBiodataBinding

class BiodataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBiodataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiodataBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}