package com.rodion2236.drivingschool.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodion2236.drivingschool.databinding.ItemCategoryDetailBinding
import com.rodion2236.drivingschool.databinding.ItemMainBinding
import com.rodion2236.drivingschool.models.DetailCategories
import com.rodion2236.drivingschool.models.Main

class CategoryDetailAdapter(private var detailItem: List<DetailCategories>): RecyclerView.Adapter<CategoryDetailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val detailBinding = ItemCategoryDetailBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(detailBinding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(detailItem[position])
    }

    override fun getItemCount(): Int {
        return detailItem.size
    }

    inner class ViewHolder(
        private val itemCategoryDetailBinding: ItemCategoryDetailBinding
    ) : RecyclerView.ViewHolder(itemCategoryDetailBinding.root) {

        fun bind(detailItem: DetailCategories) {

            itemCategoryDetailBinding.ivItemCategoryDetail.setImageResource(detailItem.icon)
            itemCategoryDetailBinding.tvCategoryDetail.text = detailItem.name
        }
    }
}