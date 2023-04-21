package com.rodion2236.drivingschool.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodion2236.drivingschool.databinding.ItemMainBinding
import com.rodion2236.drivingschool.models.Main

class MainAdapter(private var mainItem: List<Main>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val mainBinding = ItemMainBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(mainBinding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mainItem[position])
    }

    override fun getItemCount(): Int {
        return mainItem.size
    }

    inner class ViewHolder(
        private val itemMainBinding: ItemMainBinding
    ) : RecyclerView.ViewHolder(itemMainBinding.root) {

        fun bind(mainItem: Main) {
            itemMainBinding.ivItemStart.setImageResource(mainItem.icon)
            itemMainBinding.tvTitleStart.text = mainItem.name
        }
    }
}