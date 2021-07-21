package com.daffa.testmaganggits.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.daffa.testmaganggits.R

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> NumberOneFragment()
            1 -> NumberTwoFragment()
            2 -> NumberThreeFragment()
            3 -> NumberFourFragment()
            4 -> NumberFiveFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence =
        context.resources.getString(TAB_TITLES[position])


    override fun getCount(): Int = 5

    companion object {
        val TAB_TITLES = arrayOf(
            R.string.one,
            R.string.two,
            R.string.three,
            R.string.four,
            R.string.five,
        )
    }
}