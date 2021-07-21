package com.daffa.testmaganggits.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daffa.testmaganggits.databinding.FragmentNumberThreeBinding
import java.text.SimpleDateFormat
import java.util.*

class NumberThreeFragment : Fragment() {

    private lateinit var binding: FragmentNumberThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberThreeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SimpleDateFormat")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnApply.setOnClickListener {
                val inputHour = etInputNumber.text.toString()
                val date12 = SimpleDateFormat("hh:mm:ss aa")
                val date24 = SimpleDateFormat("HH:mm")
                val date: Date?
                val result: String

                try {
                    date = date12.parse(inputHour)
                    result = date24.format(date)

                    tvResult.text = result
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

}