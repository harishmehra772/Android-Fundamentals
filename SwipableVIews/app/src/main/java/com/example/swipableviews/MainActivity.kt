package com.example.swipableviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

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

        val tabLayout=findViewById<TabLayout>(R.id.tabLayout)

        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.text="${position+1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Selected ${tab?.text}",
                    Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Unselected ${tab?.text}",
                    Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Reselected ${tab?.text}",
                    Toast.LENGTH_SHORT).show()
            }
        })
    }
}