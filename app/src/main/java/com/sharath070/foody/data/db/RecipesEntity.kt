package com.sharath070.foody

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sharath070.foody.model.FoodRecipe
import com.sharath070.foody.utils.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
data class RecipesEntity (
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0,
    var foodRecipe: FoodRecipe
)