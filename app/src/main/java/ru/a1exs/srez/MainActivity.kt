package ru.a1exs.srez

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a1exs.srez.databinding.ActivityMainBinding
import android.graphics.Shader

import android.R.attr.endColor

import android.R.attr.startColor

import android.graphics.LinearGradient
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recList = ArrayList<String>()
        val viewPagerList = ArrayList<String>()

        for (i in 1..5){
            recList.add("Something")
            recList.add("Something \n New")
            viewPagerList.add("Some cool text")
        }

        binding.firstRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.firstRV.adapter = RVTopAdapter(this, recList)

        binding.viewPager.adapter = ViewPagerAdapter(this, viewPagerList)


    }
}