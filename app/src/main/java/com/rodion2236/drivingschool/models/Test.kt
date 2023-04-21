package com.rodion2236.drivingschool.models

import com.rodion2236.drivingschool.R

data class Test(
    val id: Long,
    val icon: Int,
    val name: String,
    val type: Int
)

fun getTestCategories(): List<Test> {
    return listOf(
        Test(1L,  R.drawable.bmx, "Легкий уровень", 1),
        Test(2L, R.drawable.car, "Средний уровень", 2),
        Test(3L, R.drawable.truck, "Тяжелый уровень", 3)
    )
}