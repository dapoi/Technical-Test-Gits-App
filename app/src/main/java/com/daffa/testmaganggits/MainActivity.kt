package com.daffa.testmaganggits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daffa.testmaganggits.databinding.ActivityMainBinding
import com.daffa.testmaganggits.ui.main.SectionsPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        binding.apply {
            viewPager.adapter = sectionsPagerAdapter
            tabs.setupWithViewPager(binding.viewPager)
        }
    }
}