package com.rodion2236.drivingschool.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodion2236.drivingschool.databinding.ItemCategoryBinding
import com.rodion2236.drivingschool.databinding.ItemCategoryDetailBinding
import com.rodion2236.drivingschool.models.Categories
import com.rodion2236.drivingschool.models.DetailCategories

class CategoryAdapter(private var categoryItem: List<Categories>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val categoryBinding = ItemCategoryBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(categoryBinding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoryItem[position])
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }

    inner class ViewHolder(
        private val itemCategoryBinding: ItemCategoryBinding
    ) : RecyclerView.ViewHolder(itemCategoryBinding.root) {

        fun bind(categoryItem: Categories) {

            itemCategoryBinding.ivItemCategory.setImageResource(categoryItem.icon)
            itemCategoryBinding.tvTitleCategory.text = categoryItem.name
        }
    }
}