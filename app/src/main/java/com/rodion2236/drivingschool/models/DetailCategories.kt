package com.rodion2236.drivingschool.models

data class DetailCategories(
    val id: Long,
    val icon: Int,
    val name: String,
    val type: String
)

fun getDetailCategories(): List<DetailCategories> {

    return listOf()
}
