package com.example.recipeapp.data

import com.example.recipeapp.R
import com.example.recipeapp.model.Recipe

object LocalRecipeDataProvider {

    val defaultRecipe = getRecipesList()[0]

    fun getRecipesList(): List<Recipe> {
        return listOf(
            Recipe(
                id = 0,
                nameResourceId = R.string.red_velvet,
                descResourceId = R.string.red_desc
            ),
            Recipe(
                id = 1,
                nameResourceId = R.string.devil_food,
                descResourceId = R.string.dev_desc
            ),
            Recipe(
                id = 2,
                nameResourceId = R.string.key_lime,
                descResourceId = R.string.key_desc
            )
        )
    }
}