package com.daffa.testmaganggits.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daffa.testmaganggits.databinding.FragmentNumberTwoBinding
import java.util.regex.Pattern

class NumberTwoFragment : Fragment() {

    private lateinit var binding: FragmentNumberTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberTwoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btnApply.setOnClickListener {
                val email = etInputEmail.text.toString().trim()
                val regex = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                        "\\@" +
                        "[.]" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "([co]{2}|[id]{2})" +
                        ")+"
                val pattern = Pattern.compile(regex)

                if (email.isNotEmpty() && pattern.matcher(email).matches()) {
                    tvResult.text = "Email is valid"
                } else {
                    tvResult.text = "Email is not valid"
                }
            }
        }
    }

}