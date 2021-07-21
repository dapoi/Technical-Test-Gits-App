package com.daffa.testmaganggits.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daffa.testmaganggits.databinding.FragmentNumberFiveBinding

class NumberFiveFragment : Fragment() {

    private lateinit var binding: FragmentNumberFiveBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberFiveBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnApply.setOnClickListener {
                val inputSentence = etInputSentence.text.toString()

                if (isPalindrome(inputSentence)) {
                    tvResult.text = "$inputSentence is a Palindrome"
                } else {
                    tvResult.text = "$inputSentence is not a Palindrome"
                }
            }
        }

    }

    private fun isPalindrome(sentence: String): Boolean {
        val stringBuilder = StringBuilder(sentence)

        // reverse
        val reverseSentence = stringBuilder.reverse().toString()

        // compare reversed string with input string
        return sentence.equals(reverseSentence, ignoreCase = true)
    }

}