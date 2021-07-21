package com.daffa.testmaganggits.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daffa.testmaganggits.databinding.FragmentNumberFourBinding

class NumberFourFragment : Fragment() {

    private lateinit var binding: FragmentNumberFourBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberFourBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnApply.setOnClickListener {
                val inputSentence = etInputSentence.text.toString()

                tvResult.text = inputSentence.reversed()
            }
        }
    }

}