package com.rodion2236.drivingschool.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodion2236.drivingschool.databinding.ItemCategoryTestBinding
import com.rodion2236.drivingschool.models.Test

class CategoryTestAdapter(private var categoryTestItem: List<Test>): RecyclerView.Adapter<CategoryTestAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val testBinding = ItemCategoryTestBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(testBinding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoryTestItem[position])
    }

    override fun getItemCount(): Int {
        return categoryTestItem.size
    }

    inner class ViewHolder(
        private val itemCategoryTestBinding: ItemCategoryTestBinding
    ) : RecyclerView.ViewHolder(itemCategoryTestBinding.root) {

        fun bind(testItem: Test) {

            itemCategoryTestBinding.ivItemTest.setImageResource(testItem.icon)
            itemCategoryTestBinding.tvTest.text = testItem.name
        }
    }
}