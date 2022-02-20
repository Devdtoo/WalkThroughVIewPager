package com.devdtoo.walkthroughviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.devdtoo.walkthroughviewpager.databinding.ActivityMainBinding
import com.devdtoo.walkthroughviewpager.viewpager.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var imageList : List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        imageList = generateImageList()

        val adapter = ViewPagerAdapter(imageList)
        binding.viewPager.apply {
            this.adapter = adapter
            this.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        }

    }

    private fun generateImageList(): List<Int> {
        val imageList = listOf(
            R.drawable.ic_illustration_shopping,
            R.drawable.ic_illustration_delivery,
            R.drawable.ic_illustration_research
        )
        return imageList
    }



}