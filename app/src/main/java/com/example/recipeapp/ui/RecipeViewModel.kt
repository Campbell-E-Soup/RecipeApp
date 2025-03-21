package com.example.recipeapp.ui

import androidx.lifecycle.ViewModel
import com.example.recipeapp.data.LocalRecipeDataProvider
import com.example.recipeapp.model.Recipe
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class RecipeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        RecipeUiState(
            recipesList = LocalRecipeDataProvider.getRecipesList(),
            currentRecipe = LocalRecipeDataProvider.getRecipesList().getOrElse(0) {
                LocalRecipeDataProvider.defaultRecipe
            }
        )
    )
    val uiState: StateFlow<RecipeUiState> = _uiState

    fun updateCurrentSport(selectedRecipe: Recipe) {
        _uiState.update {
            it.copy(currentRecipe = selectedRecipe)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }


    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}

data class RecipeUiState(
    val recipesList: List<Recipe> = emptyList(),
    val currentRecipe: Recipe = LocalRecipeDataProvider.defaultRecipe,
    val isShowingListPage: Boolean = true
)