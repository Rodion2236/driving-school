package com.rodion2236.drivingschool.models

import com.rodion2236.drivingschool.R

data class Main(
    val id: Long,
    val icon: Int,
    val name: String,
    val type: Int
)

fun getMainCategories(): List<Main> {
    return listOf(
        Main(1L, R.drawable.book, "Справочник", 1),
        Main(2L, R.drawable.test, "Проверь себя",2)
    )
}
