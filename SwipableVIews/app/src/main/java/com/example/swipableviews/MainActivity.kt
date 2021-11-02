package com.example.swipableviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images=listOf(
            R.drawable.angela,
            R.drawable.creed,
            R.drawable.dwight,
            R.drawable.holly,
            R.drawable.jim,
            R.drawable.kelly,
            R.drawable.kevin,
            R.drawable.oscar,
            R.drawable.pam,
            R.drawable.ryan,
            R.drawable.steve,
        )

        val adapter=viewPagerAdapter(images)
        val viewPager=findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter=adapter

        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()
    }
}