package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.FoodCategory;

public interface FoodCategoryService {
    FoodCategory updateFoodCategory(FoodCategory foodCategory);
    FoodCategory getFoodCategoryById(int foodCategoryId);
    void deleteFoodCategory(int foodCategoryId);
    FoodCategory addFoodCategory(FoodCategory foodCategory);
    List<FoodCategory> getAllFoodCategories();
}
