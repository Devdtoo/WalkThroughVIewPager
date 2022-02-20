package com.devdtoo.walkthroughviewpager.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.devdtoo.walkthroughviewpager.R

class ViewPagerAdapter(
    val imageList : List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImage = imageList[position]
        holder.imageView.setImageResource(currentImage)
    }

    override fun getItemCount(): Int = imageList.size

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imageView = itemView.findViewById<ImageView>(R.id.imageIv)
    }
}