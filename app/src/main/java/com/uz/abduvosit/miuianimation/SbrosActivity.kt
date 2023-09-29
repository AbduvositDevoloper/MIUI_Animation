package com.uz.abduvosit.miuianimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uz.abduvosit.miuianimation.databinding.ActivitySbrosBinding

class SbrosActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySbrosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySbrosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.seekBar.max = 100
        binding.tv.text = binding.seekBar.max.toString()
    }
}