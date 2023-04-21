package com.rodion2236.drivingschool.models

import com.rodion2236.drivingschool.R

data class Categories(
    val id: Long,
    val icon: Int,
    val name: String,
    val type: String
)

fun getCategories(): List<Categories> {
    return listOf(

    )
}
