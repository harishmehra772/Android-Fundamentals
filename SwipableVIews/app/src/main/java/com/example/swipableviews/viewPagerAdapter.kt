package com.example.swipableviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class viewPagerAdapter(
    val images:List<Int>
):RecyclerView.Adapter<viewPagerAdapter.viewPagerViewHolder>(){

    inner class viewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewPagerViewHolder {
        val view =LayoutInflater.from(parent.context).
        inflate(R.layout.item_view_pager,parent,false)

        return viewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: viewPagerViewHolder, position: Int) {
        val currentImage=images[position]
        holder.itemView.findViewById<ImageView>(R.id.ivImage).setImageResource(currentImage)
    }

    override fun getItemCount(): Int {
         return images.size
    }
}