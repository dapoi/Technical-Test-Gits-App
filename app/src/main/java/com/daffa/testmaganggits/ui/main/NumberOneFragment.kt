package com.daffa.testmaganggits.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daffa.testmaganggits.databinding.FragmentNumberOneBinding

class NumberOneFragment : Fragment() {

    private lateinit var binding: FragmentNumberOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnApply.setOnClickListener {
                val inputNumber = etInputNumber.text.toString().trim()
                val number = inputNumber.toInt()

                when {
                    number % 5 == 0 && number % 3 == 0 -> {
                        tvResult.text = "Hello World"
                    }
                    number % 5 == 0 -> {
                        tvResult.text = "World"
                    }
                    number % 3 == 0 -> {
                        tvResult.text = "Hello"
                    }
                    else -> tvResult.text = "Result is not Hello or World"
                }
            }
        }
    }
}