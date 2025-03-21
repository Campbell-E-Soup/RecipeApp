package com.example.recipeapp.model

import androidx.annotation.StringRes

data class Recipe(
    val id: Int,
    @StringRes val nameResourceId: Int,
    @StringRes val descResourceId: Int,
)